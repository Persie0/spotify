package p204p;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class zaa0 {

    /* JADX INFO: renamed from: a */
    public final IntentFilter f281011a;

    /* JADX INFO: renamed from: b */
    public final BroadcastReceiver f281012b;

    /* JADX INFO: renamed from: c */
    public boolean f281013c;

    /* JADX INFO: renamed from: d */
    public boolean f281014d;

    public zaa0(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f281011a = intentFilter;
        this.f281012b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f281012b);
        sb.append(" filter=");
        sb.append(this.f281011a);
        if (this.f281014d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
