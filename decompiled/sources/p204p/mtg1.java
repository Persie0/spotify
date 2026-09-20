package p204p;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mtg1 {

    /* JADX INFO: renamed from: a */
    public final int f147071a;

    /* JADX INFO: renamed from: b */
    public final ev61 f147072b = new ev61();

    /* JADX INFO: renamed from: c */
    public final int f147073c;

    /* JADX INFO: renamed from: d */
    public final Bundle f147074d;

    public mtg1(int i, int i2, Bundle bundle) {
        this.f147071a = i;
        this.f147073c = i2;
        this.f147074d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo34383a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo34384b();

    /* JADX INFO: renamed from: c */
    public final void m62823c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzqVar);
            new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
        }
        this.f147072b.m40096a(zzqVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m62824d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle);
            new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
        }
        this.f147072b.m40097b(bundle);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(this.f147073c);
        sb.append(" id=");
        sb.append(this.f147071a);
        sb.append(" oneWay=");
        sb.append(mo34384b());
        sb.append("}");
        return sb.toString();
    }
}
