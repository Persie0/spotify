package p204p;

import com.spotify.passkeys.p122v1.StartRegistrationResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class m7n0 {

    /* JADX INFO: renamed from: a */
    public final String f140807a;

    /* JADX INFO: renamed from: b */
    public final StartRegistrationResponse f140808b;

    public m7n0(String str, StartRegistrationResponse startRegistrationResponse) {
        this.f140807a = str;
        this.f140808b = startRegistrationResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7n0)) {
            return false;
        }
        m7n0 m7n0Var = (m7n0) obj;
        return wj50.m88271j(this.f140807a, m7n0Var.f140807a) && wj50.m88271j(this.f140808b, m7n0Var.f140808b);
    }

    public final int hashCode() {
        return this.f140808b.hashCode() + (this.f140807a.hashCode() * 31);
    }
}
