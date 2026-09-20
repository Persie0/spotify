package p204p;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.InlineCardTemplate;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes8.dex */
public final class fh81 extends oj30 {

    /* JADX INFO: renamed from: b */
    public final jr40 f69604b;

    /* JADX INFO: renamed from: c */
    public final qjc0 f69605c;

    /* JADX INFO: renamed from: d */
    public final Context f69606d;

    /* JADX INFO: renamed from: e */
    public final hc80 f69607e;

    /* JADX INFO: renamed from: f */
    public final Scheduler f69608f;

    /* JADX INFO: renamed from: g */
    public final iwr f69609g;

    public fh81(ConstraintLayout constraintLayout, jr40 jr40Var, qjc0 qjc0Var, Context context, hc80 hc80Var, Scheduler scheduler) {
        super(constraintLayout);
        this.f69604b = jr40Var;
        this.f69605c = qjc0Var;
        this.f69606d = context;
        this.f69607e = hc80Var;
        this.f69608f = scheduler;
        this.f69609g = new iwr();
    }

    @Override // p204p.oj30
    /* JADX INFO: renamed from: a */
    public final void mo32903a(fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        try {
            MessageResponseToken messageResponseToken = (MessageResponseToken) this.f69605c.mo62853b(fk30Var.custom());
            if (lq51.m59702h(messageResponseToken) instanceof InlineCardTemplate.Undefined) {
                return;
            }
            this.f69609g.m51848b(jr40.m54167a(this.f69604b, this.f69606d, this.f69607e, messageResponseToken, null, 24).observeOn(this.f69608f).subscribe(new s651(this, 12)));
        } catch (Exception e) {
            Logger.m3966b(edb.m38564m("Failed to build Inline Card from hubsComponent: ", e.getMessage()), new Object[0]);
        }
    }

    @Override // p204p.oj30
    /* JADX INFO: renamed from: b */
    public final void mo32904b(int... iArr) {
    }
}
