package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class xbh1 extends vxe {

    /* JADX INFO: renamed from: a */
    public final String f259916a;

    /* JADX INFO: renamed from: b */
    public final Uri f259917b;

    /* JADX INFO: renamed from: c */
    public final Uri f259918c;

    public xbh1(String str, Uri uri, Uri uri2) {
        this.f259916a = str;
        this.f259917b = uri;
        this.f259918c = uri2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vxe) {
            vxe vxeVar = (vxe) obj;
            String str = this.f259916a;
            if (str != null ? str.equals(((xbh1) vxeVar).f259916a) : ((xbh1) vxeVar).f259916a == null) {
                Uri uri = this.f259917b;
                if (uri != null ? uri.equals(((xbh1) vxeVar).f259917b) : ((xbh1) vxeVar).f259917b == null) {
                    Uri uri2 = this.f259918c;
                    if (uri2 != null ? uri2.equals(((xbh1) vxeVar).f259918c) : ((xbh1) vxeVar).f259918c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f259916a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.f259917b;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        int i = iHashCode ^ 1000003;
        Uri uri2 = this.f259918c;
        return (uri2 != null ? uri2.hashCode() : 0) ^ (((i * 1000003) ^ iHashCode2) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f259917b);
        String strValueOf2 = String.valueOf(this.f259918c);
        StringBuilder sb = new StringBuilder("CollaborationStartingState{additionalData=");
        klh.m56844p(sb, this.f259916a, ", mainStageUrl=", strValueOf, ", sidePanelUrl=");
        return dq60.m36616p(strValueOf2, "}", sb);
    }
}
