package com.spotify.base.java.logging;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p204p.h15;
import p204p.mpa0;
import p204p.pqa0;
import p204p.s571;
import p204p.ti5;
import p204p.xpa0;

/* JADX INFO: loaded from: classes.dex */
public final class Logger {

    /* JADX INFO: renamed from: a */
    public static List f3009a = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: b */
    public static xpa0 f3010b = new h15(20);

    /* JADX INFO: renamed from: c */
    public static ti5 f3011c = new ti5(28);

    /* JADX INFO: renamed from: a */
    public static void m3965a(String str, Object... objArr) {
        Iterator it = f3009a.iterator();
        while (it.hasNext()) {
            m3971g(((mpa0) it.next()).breadcrumb(), str, objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3966b(String str, Object... objArr) {
        Iterator it = f3009a.iterator();
        while (it.hasNext()) {
            m3971g(((mpa0) it.next()).mo51897a(), str, objArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3967c(Throwable th, String str, Object... objArr) {
        Iterator it = f3009a.iterator();
        while (it.hasNext()) {
            m3972h(((mpa0) it.next()).mo51897a(), th, str, objArr);
        }
    }

    public static void core(String str) {
        core(false, str);
    }

    /* JADX INFO: renamed from: d */
    public static String m3968d(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? f3010b.mo46406b(str) : f3010b.mo46407e(str, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m3969e(String str, Object... objArr) {
        Iterator it = f3009a.iterator();
        while (it.hasNext()) {
            m3971g(((mpa0) it.next()).mo51899c(), str, objArr);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3970f(Throwable th, String str, Object... objArr) {
        Iterator it = f3009a.iterator();
        while (it.hasNext()) {
            m3972h(((mpa0) it.next()).mo51899c(), th, str, objArr);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3971g(pqa0 pqa0Var, String str, Object... objArr) {
        pqa0Var.mo37400e(f3011c.m80913G(), m3968d(str, objArr));
    }

    /* JADX INFO: renamed from: h */
    public static void m3972h(pqa0 pqa0Var, Throwable th, String str, Object... objArr) {
        pqa0Var.mo37402k(f3011c.m80913G(), m3968d(str, objArr), th);
    }

    /* JADX INFO: renamed from: i */
    public static void m3973i(String str, Object... objArr) {
        Iterator it = f3009a.iterator();
        while (it.hasNext()) {
            m3971g(((mpa0) it.next()).mo51902f(), str, objArr);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m3974j(Throwable th, String str, Object... objArr) {
        Iterator it = f3009a.iterator();
        while (it.hasNext()) {
            m3972h(((mpa0) it.next()).mo51902f(), th, str, objArr);
        }
    }

    public static void core(boolean z, String str) {
        for (mpa0 mpa0Var : f3009a) {
            (z ? mpa0Var.breadcrumb() : mpa0Var.mo51899c()).mo37400e(s571.m77250i(Thread.currentThread().getName(), "@core"), m3968d(str, new Object[0]));
        }
    }

    public static void core(int i, String str, int i2, String str2) {
        core(i, false, str, i2, str2);
    }

    public static void core(int i, boolean z, String str, int i2, String str2) {
        pqa0 pqa0VarMo51901e;
        for (mpa0 mpa0Var : f3009a) {
            if (z) {
                pqa0VarMo51901e = mpa0Var.breadcrumb();
            } else if (i == 0 || i == 1) {
                pqa0VarMo51901e = mpa0Var.mo51901e();
            } else if (i == 2) {
                pqa0VarMo51901e = mpa0Var.mo51897a();
            } else if (i == 3) {
                pqa0VarMo51901e = mpa0Var.mo51902f();
            } else if (i != 4) {
                pqa0VarMo51901e = mpa0Var.mo51898b();
            } else {
                pqa0VarMo51901e = mpa0Var.mo51899c();
            }
            pqa0VarMo51901e.mo37400e(Thread.currentThread().getName() + '@' + str + ':' + i2, m3968d(str2, new Object[0]));
        }
    }
}
