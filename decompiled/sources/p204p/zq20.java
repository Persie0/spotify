package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes11.dex */
public final class zq20 {

    /* JADX INFO: renamed from: d */
    public static final zq20 f285289d = new zq20();

    /* JADX INFO: renamed from: a */
    public final boolean f285290a = true;

    /* JADX INFO: renamed from: b */
    public final boolean f285291b = true;

    /* JADX INFO: renamed from: c */
    public final boolean f285292c;

    public zq20() {
        boolean z = true;
        if (!pp91.m70525f("  ") && !pp91.m70525f("") && !pp91.m70525f("") && !pp91.m70525f("")) {
            z = false;
        }
        this.f285292c = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m96714a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Alert.DURATION_SHOW_INDEFINITELY);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Alert.DURATION_SHOW_INDEFINITELY);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        klh.m56844p(sb, str, "bytePrefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        m96714a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
