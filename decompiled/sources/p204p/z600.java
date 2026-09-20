package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z600 implements y600 {

    /* JADX INFO: renamed from: a */
    public final String f279668a;

    /* JADX INFO: renamed from: b */
    public final int f279669b;

    /* JADX INFO: renamed from: c */
    public final int f279670c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ c700 f279671d;

    public z600(c700 c700Var, String str, int i, int i2) {
        this.f279671d = c700Var;
        this.f279668a = str;
        this.f279669b = i;
        this.f279670c = i2;
    }

    @Override // p204p.y600
    /* JADX INFO: renamed from: a */
    public final boolean mo24881a(ArrayList arrayList, ArrayList arrayList2) {
        i500 i500Var = this.f279671d.f34648A;
        if (i500Var != null && this.f279669b < 0 && this.f279668a == null && i500Var.m49716o0().m31616Y(-1, 0)) {
            return false;
        }
        return this.f279671d.m31617Z(arrayList, arrayList2, this.f279668a, this.f279669b, this.f279670c);
    }
}
