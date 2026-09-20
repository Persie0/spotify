package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class i95 {

    /* JADX INFO: renamed from: a */
    public final int f99910a;

    /* JADX INFO: renamed from: b */
    public final int f99911b;

    public i95(int i, int i2) {
        this.f99910a = i;
        this.f99911b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i95)) {
            return false;
        }
        i95 i95Var = (i95) obj;
        return this.f99910a == i95Var.f99910a && this.f99911b == i95Var.f99911b;
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f99910a) * 31;
        int i = this.f99911b;
        return iM38547C + (i == 0 ? 0 : edb.m38547C(i));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SectionFieldMapping(section=");
        sb.append(ydj.m93460s(this.f99910a));
        sb.append(", field=");
        switch (this.f99911b) {
            case 1:
                str = "ANON_ID";
                break;
            case 2:
                str = "FB_LOGIN_ID";
                break;
            case 3:
                str = "MAD_ID";
                break;
            case 4:
                str = "PAGE_ID";
                break;
            case 5:
                str = "PAGE_SCOPED_USER_ID";
                break;
            case 6:
                str = "USER_DATA";
                break;
            case 7:
                str = "ADV_TE";
                break;
            case 8:
                str = "APP_TE";
                break;
            case 9:
                str = "CONSIDER_VIEWS";
                break;
            case 10:
                str = "DEVICE_TOKEN";
                break;
            case 11:
                str = "EXT_INFO";
                break;
            case 12:
                str = "INCLUDE_DWELL_DATA";
                break;
            case 13:
                str = "INCLUDE_VIDEO_DATA";
                break;
            case 14:
                str = "INSTALL_REFERRER";
                break;
            case 15:
                str = "INSTALLER_PACKAGE";
                break;
            case 16:
                str = "RECEIPT_DATA";
                break;
            case 17:
                str = "URL_SCHEMES";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
