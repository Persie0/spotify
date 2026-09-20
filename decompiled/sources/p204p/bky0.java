package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bky0 {

    /* JADX INFO: renamed from: a */
    public final eh00 f28041a;

    /* JADX INFO: renamed from: b */
    public final eh00 f28042b;

    /* JADX INFO: renamed from: c */
    public final boolean f28043c;

    public bky0(eh00 eh00Var, eh00 eh00Var2, boolean z) {
        this.f28041a = eh00Var;
        this.f28042b = eh00Var2;
        this.f28043c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.f28041a.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.f28042b.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        return s571.m77253l(sb, this.f28043c, ')');
    }
}
