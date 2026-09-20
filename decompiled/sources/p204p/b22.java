package p204p;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class b22 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final hz6 f22471a;

    /* JADX INFO: renamed from: b */
    public final om0 f22472b;

    /* JADX INFO: renamed from: c */
    public int f22473c;

    /* JADX INFO: renamed from: d */
    public boolean f22474d;

    /* JADX INFO: renamed from: e */
    public String f22475e;

    public b22(Handler handler, hz6 hz6Var, om0 om0Var) {
        super(handler);
        this.f22471a = hz6Var;
        this.f22472b = om0Var;
        int iM71693d = ((pz6) hz6Var).m71693d();
        this.f22473c = iM71693d;
        this.f22474d = iM71693d == 0;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        String str = this.f22475e;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            String str2 = str;
            if (str2 == null) {
                return;
            }
            int iM71693d = ((pz6) this.f22471a).m71693d();
            if (iM71693d != this.f22473c) {
                om0.m67311c(this.f22472b, qm0.VOLUME_CHANGE, str2, 0L, null, null, null, null, 96);
                this.f22473c = iM71693d;
            }
            boolean z2 = iM71693d == 0;
            if (this.f22474d != z2) {
                this.f22474d = z2;
                om0.m67311c(this.f22472b, z2 ? qm0.MUTED : qm0.UNMUTED, str2, 0L, null, null, null, null, 96);
            }
        }
    }
}
