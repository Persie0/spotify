package p204p;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class je41 implements ie41 {

    /* JADX INFO: renamed from: a */
    public final z4l0 f111451a;

    /* JADX INFO: renamed from: b */
    public final z4l0 f111452b;

    /* JADX INFO: renamed from: c */
    public final z4l0 f111453c;

    /* JADX INFO: renamed from: d */
    public final z4l0 f111454d;

    public je41(slq slqVar, xre xreVar, nvu0 nvu0Var, nvu0 nvu0Var2, qnd1 qnd1Var, khj0 khj0Var, n5l0 n5l0Var, o5l0 o5l0Var, pd2 pd2Var, Set set, Set set2, vrv0 vrv0Var, a5l0 a5l0Var, i5l0 i5l0Var, h04 h04Var) {
        tnd1 tnd1Var = new tnd1(qnd1Var, xreVar);
        pnd1 pnd1Var = new pnd1(qnd1Var, slqVar);
        xja xjaVar = new xja(nvu0Var, 1);
        z4l0 z4l0Var = new z4l0();
        qwz0 qwz0Var = new qwz0(khj0Var, 9);
        y4l0 y4l0VarM95347a = z4l0Var.m95347a();
        y4l0VarM95347a.m92814a(o5l0Var);
        y4l0VarM95347a.f269175d.add(n5l0Var);
        y4l0VarM95347a.f269176e = new n95(new z4l0(y4l0VarM95347a).f279273d, i5l0Var);
        we41 we41Var = new we41();
        y4l0VarM95347a.m92816c(we41Var, we41Var.f250432a);
        ze41 ze41Var = new ze41();
        if (!ze41Var.equals(y4l0VarM95347a.f269187p)) {
            y4l0VarM95347a.f269170E = null;
        }
        y4l0VarM95347a.f269187p = ze41Var;
        y4l0VarM95347a.f269175d.addAll(set2);
        aa20 aa20Var = aa20.f13746a;
        if (!aa20Var.equals(y4l0VarM95347a.f269185n)) {
            y4l0VarM95347a.f269170E = null;
        }
        y4l0VarM95347a.f269185n = aa20Var;
        y4l0VarM95347a.f269178g = true;
        z4l0 z4l0Var2 = new z4l0(y4l0VarM95347a);
        y4l0 y4l0VarM95347a2 = z4l0Var2.m95347a();
        Set set3 = set;
        y4l0VarM95347a2.f269174c.addAll(set3);
        y4l0VarM95347a2.m92814a(pd2Var);
        this.f111454d = new z4l0((y4l0) qwz0Var.invoke(y4l0VarM95347a2));
        y4l0 y4l0VarM95347a3 = z4l0Var2.m95347a();
        osr osrVar = new osr();
        int i = a5l0Var.f12551a;
        if (i < 1) {
            throw new IllegalArgumentException(s571.m77246e(i, "max < 1: ").toString());
        }
        synchronized (osrVar) {
            osrVar.f168862a = i;
        }
        osr.m67749d(osrVar, null, null, null, 7);
        int i2 = a5l0Var.f12552b;
        if (i2 < 1) {
            throw new IllegalArgumentException(s571.m77246e(i2, "max < 1: ").toString());
        }
        synchronized (osrVar) {
            osrVar.f168863b = i2;
        }
        osr.m67749d(osrVar, null, null, null, 7);
        y4l0VarM95347a3.f269172a = osrVar;
        int i3 = a5l0Var.f12553c;
        long j = a5l0Var.f12554d;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        y4l0VarM95347a3.f269173b = new xyi(i3, j);
        long j2 = a5l0Var.f12555e;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        y4l0VarM95347a3.f269196y = c0f1.m31131b("timeout", j2, timeUnit2);
        y4l0VarM95347a3.m92815b(a5l0Var.f12556f, timeUnit2);
        y4l0VarM95347a3.m92817d(a5l0Var.f12557g, timeUnit2);
        y4l0VarM95347a3.f269195x = c0f1.m31131b("timeout", a5l0Var.f12558h, timeUnit2);
        y4l0VarM95347a3.f269177f = a5l0Var.f12559i;
        y4l0VarM95347a3.m92814a(vrv0Var);
        nvu0Var.m65748a(y4l0VarM95347a3);
        y4l0VarM95347a3.m92814a(pd2Var);
        z4l0 z4l0Var3 = new z4l0((y4l0) qwz0Var.invoke(y4l0VarM95347a3));
        this.f111451a = z4l0Var3;
        y4l0 y4l0VarM95347a4 = z4l0Var3.m95347a();
        y4l0VarM95347a4.f269174c.addAll(set3);
        z4l0 z4l0Var4 = new z4l0(y4l0VarM95347a4);
        y4l0 y4l0VarM95347a5 = z4l0Var4.m95347a();
        y4l0VarM95347a5.f269174c.add(tnd1Var);
        y4l0VarM95347a5.f269174c.add(pnd1Var);
        if (!h04Var.m46239d()) {
            y4l0VarM95347a5.m92814a(xjaVar);
        }
        this.f111452b = new z4l0((y4l0) qwz0Var.invoke(y4l0VarM95347a5));
        y4l0 y4l0VarM95347a6 = z4l0Var4.m95347a();
        nvu0Var2.m65748a(y4l0VarM95347a6);
        this.f111453c = new z4l0((y4l0) qwz0Var.invoke(y4l0VarM95347a6));
    }
}
