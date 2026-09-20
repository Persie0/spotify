package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX INFO: loaded from: classes3.dex */
public final class h95 {

    /* JADX INFO: renamed from: a */
    public final int f88876a;

    /* JADX INFO: renamed from: b */
    public final int f88877b;

    public h95(int i, int i2) {
        this.f88876a = i;
        this.f88877b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h95)) {
            return false;
        }
        h95 h95Var = (h95) obj;
        return this.f88876a == h95Var.f88876a && this.f88877b == h95Var.f88877b;
    }

    public final int hashCode() {
        int i = this.f88876a;
        return edb.m38547C(this.f88877b) + ((i == 0 ? 0 : edb.m38547C(i)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SectionCustomEventFieldMapping(section=");
        sb.append(ydj.m93460s(this.f88876a));
        sb.append(", field=");
        switch (this.f88877b) {
            case 1:
                str = "VALUE_TO_SUM";
                break;
            case 2:
                str = "EVENT_TIME";
                break;
            case 3:
                str = "EVENT_NAME";
                break;
            case 4:
                str = "CONTENT_IDS";
                break;
            case 5:
                str = "CONTENTS";
                break;
            case 6:
                str = "CONTENT_TYPE";
                break;
            case 7:
                str = "DESCRIPTION";
                break;
            case 8:
                str = "LEVEL";
                break;
            case 9:
                str = "MAX_RATING_VALUE";
                break;
            case 10:
                str = "NUM_ITEMS";
                break;
            case 11:
                str = "PAYMENT_INFO_AVAILABLE";
                break;
            case 12:
                str = "REGISTRATION_METHOD";
                break;
            case 13:
                str = "SEARCH_STRING";
                break;
            case 14:
                str = SearchEndpointResponseKt.RESULT_SUCCESS;
                break;
            case 15:
                str = "ORDER_ID";
                break;
            case 16:
                str = "AD_TYPE";
                break;
            case 17:
                str = "CURRENCY";
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
