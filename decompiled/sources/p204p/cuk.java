package p204p;

import androidx.compose.p002ui.geometry.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class cuk implements ch01, fj50 {

    /* JADX INFO: renamed from: a */
    public final fuk f42140a;

    /* JADX INFO: renamed from: b */
    public final fuk f42141b;

    /* JADX INFO: renamed from: c */
    public final fuk f42142c;

    /* JADX INFO: renamed from: d */
    public final fuk f42143d;

    public cuk(fuk fukVar, fuk fukVar2, fuk fukVar3, fuk fukVar4) {
        this.f42140a = fukVar;
        this.f42141b = fukVar2;
        this.f42142c = fukVar3;
        this.f42143d = fukVar4;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ cuk m33927d(cuk cukVar, fuk fukVar, fuk fukVar2, fuk fukVar3, fuk fukVar4, int i) {
        if ((i & 1) != 0) {
            fukVar = cukVar.f42140a;
        }
        if ((i & 2) != 0) {
            fukVar2 = cukVar.f42141b;
        }
        if ((i & 4) != 0) {
            fukVar3 = cukVar.f42142c;
        }
        if ((i & 8) != 0) {
            fukVar4 = cukVar.f42143d;
        }
        return cukVar.mo33928c(fukVar, fukVar2, fukVar3, fukVar4);
    }

    @Override // p204p.ch01
    /* JADX INFO: renamed from: a */
    public final ncg1 mo29107a(long j, ko70 ko70Var, yqq yqqVar) {
        float fMo29770a = this.f42140a.mo29770a(j, yqqVar);
        float fMo29770a2 = this.f42141b.mo29770a(j, yqqVar);
        float fMo29770a3 = this.f42142c.mo29770a(j, yqqVar);
        float fMo29770a4 = this.f42143d.mo29770a(j, yqqVar);
        float fM264e = Size.m264e(j);
        float f = fMo29770a + fMo29770a4;
        if (f > fM264e) {
            float f2 = fM264e / f;
            fMo29770a *= f2;
            fMo29770a4 *= f2;
        }
        float f3 = fMo29770a2 + fMo29770a3;
        if (f3 > fM264e) {
            float f4 = fM264e / f3;
            fMo29770a2 *= f4;
            fMo29770a3 *= f4;
        }
        if (fMo29770a < 0.0f || fMo29770a2 < 0.0f || fMo29770a3 < 0.0f || fMo29770a4 < 0.0f) {
            pt40.m70891a("Corner size in Px can't be negative(topStart = " + fMo29770a + ", topEnd = " + fMo29770a2 + ", bottomEnd = " + fMo29770a3 + ", bottomStart = " + fMo29770a4 + ")!");
        }
        return mo33929e(j, fMo29770a, fMo29770a2, fMo29770a3, fMo29770a4, ko70Var);
    }

    /* JADX INFO: renamed from: c */
    public abstract cuk mo33928c(fuk fukVar, fuk fukVar2, fuk fukVar3, fuk fukVar4);

    /* JADX INFO: renamed from: e */
    public abstract ncg1 mo33929e(long j, float f, float f2, float f3, float f4, ko70 ko70Var);
}
