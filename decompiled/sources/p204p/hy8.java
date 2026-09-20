package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes8.dex */
public abstract class hy8 {

    /* JADX INFO: renamed from: a */
    public final bue0 f96486a;

    /* JADX INFO: renamed from: b */
    public final ske f96487b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f96488c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f96489d;

    /* JADX INFO: renamed from: e */
    public final FormatType f96490e;

    /* JADX INFO: renamed from: f */
    public final gza f96491f;

    /* JADX INFO: renamed from: g */
    public final jal0 f96492g;

    /* JADX INFO: renamed from: h */
    public final ytx0 f96493h;

    /* JADX INFO: renamed from: i */
    public final lwr f96494i;

    /* JADX INFO: renamed from: j */
    public final lwr f96495j;

    public hy8(bue0 bue0Var, ske skeVar, Scheduler scheduler, Scheduler scheduler2, FormatType formatType, gza gzaVar, jal0 jal0Var, ytx0 ytx0Var) {
        this.f96486a = bue0Var;
        this.f96487b = skeVar;
        this.f96488c = scheduler;
        this.f96489d = scheduler2;
        this.f96490e = formatType;
        this.f96491f = gzaVar;
        this.f96492g = jal0Var;
        this.f96493h = ytx0Var;
        this.f96494i = new lwr();
        this.f96495j = new lwr();
        Logger.m3969e("ClientMessagingPlatform: UI Plugin: Initializing Plugin for formatType: " + formatType, new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    public final void m49126f() {
        Logger.m3969e("ClientMessagingPlatform: UI Plugin: UI Destroyed for formatType: " + this.f96490e, new Object[0]);
        this.f96495j.m60129c();
        this.f96494i.m60129c();
    }

    /* JADX INFO: renamed from: g */
    public final void m49127g(r55 r55Var) {
        StringBuilder sb = new StringBuilder("ClientMessagingPlatform: UI Plugin: UI Visible for formatType: ");
        FormatType formatType = this.f96490e;
        sb.append(formatType);
        Logger.m3969e(sb.toString(), new Object[0]);
        this.f96494i.m60127a(((hue0) this.f96486a).f95393c.f225200a.hide().filter(new fue0(formatType)).map(gue0.f84462a).subscribeOn(this.f96489d).observeOn(this.f96488c).subscribe(new gy8(this, r55Var)));
    }

    public /* synthetic */ hy8(bue0 bue0Var, ske skeVar, Scheduler scheduler, Scheduler scheduler2, FormatType formatType, gza gzaVar, jal0 jal0Var) {
        this(bue0Var, skeVar, scheduler, scheduler2, formatType, gzaVar, jal0Var, m3q.f139697a);
    }
}
