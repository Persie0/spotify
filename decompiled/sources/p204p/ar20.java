package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ar20 {

    /* JADX INFO: renamed from: b */
    public static final ar20 f18911b = new ar20();

    /* JADX INFO: renamed from: a */
    public final boolean f18912a = true;

    public ar20() {
        if (pp91.m70525f("")) {
            return;
        }
        pp91.m70525f("");
    }

    /* JADX INFO: renamed from: a */
    public final void m26913a(StringBuilder sb, String str) {
        klh.m56844p(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        m26913a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
