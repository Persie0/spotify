package p204p;

import com.spotify.jam.internal.socialconnect.models.HostApprovalResponseError;

/* JADX INFO: loaded from: classes2.dex */
public final class f930 extends l930 {

    /* JADX INFO: renamed from: a */
    public final HostApprovalResponseError f67164a;

    public f930(HostApprovalResponseError hostApprovalResponseError) {
        this.f67164a = hostApprovalResponseError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f930) && wj50.m88271j(this.f67164a, ((f930) obj).f67164a);
    }

    public final int hashCode() {
        HostApprovalResponseError hostApprovalResponseError = this.f67164a;
        if (hostApprovalResponseError == null) {
            return 0;
        }
        return hostApprovalResponseError.hashCode();
    }
}
