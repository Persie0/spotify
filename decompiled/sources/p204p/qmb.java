package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public final class qmb implements smb {

    /* JADX INFO: renamed from: a */
    public final int f190177a;

    /* JADX INFO: renamed from: b */
    public final Intent f190178b;

    public qmb(Intent intent, int i) {
        this.f190177a = i;
        this.f190178b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmb)) {
            return false;
        }
        qmb qmbVar = (qmb) obj;
        return this.f190177a == qmbVar.f190177a && wj50.m88271j(this.f190178b, qmbVar.f190178b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f190177a) * 31;
        Intent intent = this.f190178b;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }
}
