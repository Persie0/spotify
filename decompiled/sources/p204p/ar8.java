package p204p;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes6.dex */
public final class ar8 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18973a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f18974b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar8(Object obj, Handler handler, int i) {
        super(handler);
        this.f18973a = i;
        this.f18974b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f18973a) {
            case 2:
                return false;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.f18973a) {
            case 3:
                ((bqa) this.f18974b).mo30231j(w2a1.f247311a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        switch (this.f18973a) {
            case 0:
                ((br8) this.f18974b).m30291H1();
                break;
            case 1:
                super.onChange(z);
                gnb1 gnb1Var = (gnb1) ((whp) this.f18974b).f251420c;
                if (gnb1Var != null) {
                    gnb1Var.invoke();
                }
                break;
            case 2:
                l6p0 l6p0Var = (l6p0) this.f18974b;
                l6p0Var.f130432y1.m39516c(l6p0.f130425z1[1], l6p0Var, Integer.valueOf(((pz6) l6p0Var.f130428u1).m71693d()));
                break;
            default:
                super.onChange(z);
                break;
        }
    }
}
