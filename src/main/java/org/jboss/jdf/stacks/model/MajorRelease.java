/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.jdf.stacks.model;

import java.util.ArrayList;
import java.util.List;

public class MajorRelease {
    
    private String name;

    private String version;

    private ServerRuntime recommendedRuntime;

    private List<MinorRelease> minorReleases = new ArrayList<MinorRelease>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ServerRuntime getRecommendedRuntime() {
        return recommendedRuntime;
    }

    public void setRecommendedRuntime(ServerRuntime recommendedRuntime) {
        this.recommendedRuntime = recommendedRuntime;
    }

    public List<MinorRelease> getMinorReleases() {
        return minorReleases;
    }

    public void setMinorReleases(List<MinorRelease> minorReleases) {
        this.minorReleases = minorReleases;
    }
}
