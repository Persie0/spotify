package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m771 {

    /* JADX INFO: renamed from: f */
    public static final gg5 f140724f = new gg5(28);

    /* JADX INFO: renamed from: a */
    public final w591 f140725a;

    /* JADX INFO: renamed from: b */
    public final if71 f140726b;

    /* JADX INFO: renamed from: c */
    public final boolean f140727c;

    /* JADX INFO: renamed from: d */
    public final boolean f140728d;

    /* JADX INFO: renamed from: e */
    public final boolean f140729e;

    public m771(w591 w591Var, if71 if71Var, boolean z, boolean z2, boolean z3) {
        this.f140725a = w591Var;
        this.f140726b = if71Var;
        this.f140727c = z;
        this.f140728d = z2;
        this.f140729e = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append(this.f140725a);
        sb.append(", textStyle=");
        sb.append(this.f140726b);
        sb.append(", singleLine=");
        sb.append(this.f140727c);
        sb.append(", softWrap=");
        sb.append(this.f140728d);
        sb.append(", isKeyboardTypePhone=");
        return s571.m77253l(sb, this.f140729e, ')');
    }
}
