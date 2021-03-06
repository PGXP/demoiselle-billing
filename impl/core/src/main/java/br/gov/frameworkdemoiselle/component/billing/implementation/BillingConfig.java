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
package br.gov.frameworkdemoiselle.component.billing.implementation;

import br.gov.frameworkdemoiselle.annotation.Name;
import br.gov.frameworkdemoiselle.configuration.Configuration;
import java.util.logging.Logger;

/**
 *
 * @author SERPRO
 *
 */
@Configuration(prefix = "frameworkdemoiselle.billing")
public class BillingConfig {

    private static final Long TIME_DEFAULT = 3600000L;

    @Name("system")
    private String system;

    @Name("folder.fail.objects")
    private String folderFailObjects;

    @Name("scheduler.start.time")
    private Long schedulerStartTime;

    @Name("scheduler.repeat.interval")
    private Long schedulerRepeatInterval;

    /**
     *
     * @return
     */
    public String getSystem() {
        return system;
    }

    /**
     *
     * @param system
     */
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     *
     * @return
     */
    public String getFolderFailObjects() {
        return folderFailObjects;
    }

    /**
     *
     * @param folderFailObjects
     */
    public void setFolderFailObjects(String folderFailObjects) {
        this.folderFailObjects = folderFailObjects;
    }

    /**
     *
     * @return
     */
    public Long getSchedulerStartTime() {
        return schedulerStartTime == null ? TIME_DEFAULT : schedulerStartTime;
    }

    /**
     *
     * @param schedulerStartTime
     */
    public void setSchedulerStartTime(Long schedulerStartTime) {
        this.schedulerStartTime = schedulerStartTime;
    }

    /**
     *
     * @return
     */
    public Long getSchedulerRepeatInterval() {
        return schedulerRepeatInterval == null ? TIME_DEFAULT : schedulerRepeatInterval;
    }

    /**
     *
     * @param schedulerRepeatInterval
     */
    public void setSchedulerRepeatInterval(Long schedulerRepeatInterval) {
        this.schedulerRepeatInterval = schedulerRepeatInterval;
    }

    @Override
    public String toString() {
        return "AuditConfig{" + "folderFailObjects=" + folderFailObjects + ", schedulerStartTime=" + schedulerStartTime + ", schedulerRepeatInterval=" + schedulerRepeatInterval + ", system=" + system + '}';
    }
    private static final Logger LOG = Logger.getLogger(BillingConfig.class.getName());

}
