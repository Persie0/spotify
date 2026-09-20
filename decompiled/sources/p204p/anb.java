package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public final class anb implements dnb {

    /* JADX INFO: renamed from: a */
    public final int f17352a;

    /* JADX INFO: renamed from: b */
    public final Intent f17353b;

    public anb(Intent intent, int i) {
        this.f17352a = i;
        this.f17353b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anb)) {
            return false;
        }
        anb anbVar = (anb) obj;
        return this.f17352a == anbVar.f17352a && wj50.m88271j(this.f17353b, anbVar.f17353b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17352a) * 31;
        Intent intent = this.f17353b;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }
}
