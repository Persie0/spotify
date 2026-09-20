package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class br20 {

    /* JADX INFO: renamed from: d */
    public static final br20 f29944d;

    /* JADX INFO: renamed from: e */
    public static final br20 f29945e;

    /* JADX INFO: renamed from: a */
    public final boolean f29946a;

    /* JADX INFO: renamed from: b */
    public final zq20 f29947b;

    /* JADX INFO: renamed from: c */
    public final ar20 f29948c;

    static {
        zq20 zq20Var = zq20.f285289d;
        ar20 ar20Var = ar20.f18911b;
        f29944d = new br20(false, zq20Var, ar20Var);
        f29945e = new br20(true, zq20Var, ar20Var);
    }

    public br20(boolean z, zq20 zq20Var, ar20 ar20Var) {
        this.f29946a = z;
        this.f29947b = zq20Var;
        this.f29948c = ar20Var;
    }

    public final String toString() {
        StringBuilder sbM36620t = dq60.m36620t("HexFormat(\n    upperCase = ");
        sbM36620t.append(this.f29946a);
        sbM36620t.append(",\n    bytes = BytesHexFormat(\n");
        this.f29947b.m96714a(sbM36620t, "        ");
        sbM36620t.append('\n');
        sbM36620t.append("    ),");
        sbM36620t.append('\n');
        sbM36620t.append("    number = NumberHexFormat(");
        sbM36620t.append('\n');
        this.f29948c.m26913a(sbM36620t, "        ");
        sbM36620t.append('\n');
        sbM36620t.append("    )");
        sbM36620t.append('\n');
        sbM36620t.append(")");
        return sbM36620t.toString();
    }
}
