/*
 * Demoiselle Framework
 * Copyright (C) 2014 SERPRO
 * ----------------------------------------------------------------------------
 * This file is part of Demoiselle Framework.
 *
 * Demoiselle Framework is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License version 3
 * along with this program; if not,  see <http://www.gnu.org/licenses/>
 * or write to the Free Software Foundation, Inc., 51 Franklin Street,
 * Fifth Floor, Boston, MA  02110-1301, USA.
 * ----------------------------------------------------------------------------
 * Este arquivo é parte do Framework Demoiselle.
 *
 * O Framework Demoiselle é um software livre; você pode redistribuí-lo e/ou
 * modificá-lo dentro dos termos da GNU LGPL versão 3 como publicada pela Fundação
 * do Software Livre (FSF).
 *
 * Este programa é distribuído na esperança que possa ser útil, mas SEM NENHUMA
 * GARANTIA; sem uma garantia implícita de ADEQUAÇÃO a qualquer MERCADO ou
 * APLICAÇÃO EM PARTICULAR. Veja a Licença Pública Geral GNU/LGPL em português
 * para maiores detalhes.
 *
 * Você deve ter recebido uma cópia da GNU LGPL versão 3, sob o título
 * "LICENCA.txt", junto com esse programa. Se não, acesse <http://www.gnu.org/licenses/>
 * ou escreva para a Fundação do Software Livre (FSF) Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02111-1301, USA.
 */
package br.gov.frameworkdemoiselle.component.billing.implementation.util;

import com.google.gson.Gson;
import java.io.File;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author SERPRO
 *
 */
public final class Util {

    /**
     *
     * @param string
     * @return
     */
    public static Map<String, String> jsonToMap(String string) {
        Map<String, String> retorno = new Gson().fromJson((String) string, Map.class);
        return retorno;
    }

    /**
     *
     * @param object
     * @return
     */
    public static String jsonSerializer(Object object) {
        return new Gson().toJson(object);
    }

    /**
     *
     * @return
     */
    public static String getFolderPathDefault() {
        return System.getProperty("user.dir") + File.separatorChar + "demoiselle-audit-log" + File.separatorChar;
    }
    private static final Logger LOG = Logger.getLogger(Util.class.getName());

}
