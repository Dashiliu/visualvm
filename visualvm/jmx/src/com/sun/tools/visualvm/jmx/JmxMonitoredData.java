/*
 * Copyright 2007-2008 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package com.sun.tools.visualvm.jmx;

import com.sun.tools.visualvm.application.JVM;
import com.sun.tools.visualvm.application.MonitoredData;
import com.sun.tools.visualvm.tools.jmx.JvmJmxModel;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.MemoryUsage;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;
import sun.jvmstat.monitor.LongMonitor;

/**
 *
 * @author Tomas Hurka
 */
public class JmxMonitoredData extends MonitoredData {


//  JmxMonitoredData(JmxJVM jvm) {
//    JvmJmxModel jvmModel = jvm.getJmxModel();
//    ClassLoadingMXBean classBean = jvmModel.getClassLoadingMXBean();
//    ThreadMXBean threadBean = jvmModel.getThreadMXBean();
//    RuntimeMXBean runtimeBean = jvmModel.getRuntimeMXBean();
//    MemoryUsage mem = jvmModel.getMemoryMXBean().getHeapMemoryUsage();
//    MemoryUsage perm = jvm.getPermGenPool().getUsage();
//    loadedClasses = classBean.getLoadedClassCount();
//    sharedLoadedClasses = 0;
//    sharedUnloadedClasses = 0;
//    unloadedClasses = classBean.getUnloadedClassCount();
//    threadsDaemon = threadBean.getDaemonThreadCount();
//    threadsLive = threadBean.getThreadCount();
//    threadsLivePeak = threadBean.getPeakThreadCount();
//    threadsStarted = threadBean.getTotalStartedThreadCount();
//    applicationTime = 0;
//    upTime = runtimeBean.getUptime();
//    genCapacity = new long[2];
//    genUsed = new long[2];
//    genMaxCapacity = new long[2];
//    genCapacity[0] = mem.getCommitted();
//    genUsed[0] = mem.getUsed();
//    genMaxCapacity[0] = mem.getMax();
//    genCapacity[1] = perm.getCommitted();
//    genUsed[1] = perm.getUsed();
//    genMaxCapacity[1] = perm.getMax();
//    monitoredVm = jvm;
//  }
  
  private long getLongValue(LongMonitor mon) {
    if (mon!=null) {
      return mon.longValue();
    }
    return 0;
  }
  
  public long getLoadedClasses() {
    return loadedClasses;
  }

  public long getSharedLoadedClasses() {
    return sharedLoadedClasses;
  }

  public long getSharedUnloadedClasses() {
    return sharedUnloadedClasses;
  }

  public long getUnloadedClasses() {
    return unloadedClasses;
  }

  public long getThreadsDaemon() {
    return threadsDaemon;
  }

  public long getThreadsLive() {
    return threadsLive;
  }

  public long getThreadsLivePeak() {
    return threadsLivePeak;
  }

  public long getThreadsStarted() {
    return threadsStarted;
  }

  public long getApplicationTime() {
    return applicationTime;
  }

  public JVM getMonitoredVm() {
    return monitoredVm;
  }

  public long getUpTime() {
    return upTime;
  }

  public long[] getGenCapacity() {
    return genCapacity;
  }

  public long[] getGenUsed() {
    return genUsed;
  }
  
  public long[] getGenMaxCapacity() {
    return genMaxCapacity;
  }
}
