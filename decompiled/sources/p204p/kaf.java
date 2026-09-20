package p204p;

import android.os.Handler;
import android.os.Message;
import com.comscore.Analytics;
import com.comscore.PublisherConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class kaf implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final i4t0 f120887a;

    /* JADX INFO: renamed from: b */
    public final iaf f120888b;

    /* JADX INFO: renamed from: c */
    public Handler f120889c;

    /* JADX INFO: renamed from: d */
    public boolean f120890d;

    /* JADX INFO: renamed from: e */
    public boolean f120891e;

    /* JADX INFO: renamed from: f */
    public boolean f120892f;

    public kaf(ihm ihmVar, ihm ihmVar2) {
        this.f120887a = ihmVar2;
        this.f120888b = (iaf) ihmVar.get();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f120892f) {
            return true;
        }
        int i = message.what;
        iaf iafVar = this.f120888b;
        if (i == 0) {
            jaf jafVar = (jaf) iafVar;
            jafVar.getClass();
            Analytics.getConfiguration().addClient(new PublisherConfiguration.Builder().publisherId("15654041").build());
            Analytics.getConfiguration().setUsagePropertiesAutoUpdateMode(cy7.m34342a(faf.f67549a).intValue());
            Analytics.start(jafVar.f110455a);
            return true;
        }
        if (i == 1) {
            ((jaf) iafVar).getClass();
            Analytics.notifyUxActive();
            this.f120890d = true;
            return true;
        }
        if (i == 2) {
            ((jaf) iafVar).getClass();
            Analytics.notifyUxInactive();
            this.f120890d = false;
            return true;
        }
        if (i == 3) {
            ((jaf) iafVar).getClass();
            Analytics.notifyEnterForeground();
            return true;
        }
        if (i == 4) {
            ((jaf) iafVar).getClass();
            Analytics.notifyExitForeground();
            return true;
        }
        na6.m63965m("Unexpected message " + i);
        return true;
    }
}
