package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wi00 {

    /* JADX INFO: renamed from: a */
    public final y400 f251467a;

    /* JADX INFO: renamed from: b */
    public final String f251468b;

    /* JADX INFO: renamed from: c */
    public final int f251469c;

    public wi00(y400 y400Var, String str, int i) {
        this.f251467a = y400Var;
        this.f251468b = str;
        this.f251469c = i;
    }

    /* JADX INFO: renamed from: a */
    public final qti0 m88181a(int i) {
        return qti0.m73841e(this.f251468b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f251467a);
        sb.append('.');
        return dq60.m36617q(sb, this.f251468b, 'N');
    }
}
