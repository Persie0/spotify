package p204p;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes9.dex */
public final class usj0 {

    /* JADX INFO: renamed from: a */
    public final btj0 f233642a;

    /* JADX INFO: renamed from: b */
    public final PendingIntent f233643b;

    /* JADX INFO: renamed from: c */
    public final boolean f233644c;

    public usj0(btj0 btj0Var, PendingIntent pendingIntent, boolean z) {
        this.f233642a = btj0Var;
        this.f233643b = pendingIntent;
        this.f233644c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usj0)) {
            return false;
        }
        usj0 usj0Var = (usj0) obj;
        return this.f233642a.equals(usj0Var.f233642a) && wj50.m88271j(this.f233643b, usj0Var.f233643b) && this.f233644c == usj0Var.f233644c;
    }

    public final int hashCode() {
        int iHashCode = this.f233642a.hashCode() * 31;
        PendingIntent pendingIntent = this.f233643b;
        return Boolean.hashCode(this.f233644c) + ((iHashCode + (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 31);
    }
}
