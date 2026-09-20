package p204p;

import android.content.Context;
import android.content.Intent;
import com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class po21 implements boe0 {

    /* JADX INFO: renamed from: a */
    public final Context f179568a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f179569b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f179570c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final BehaviorSubject f179571d = BehaviorSubject.m23795f();

    /* JADX INFO: renamed from: e */
    public final BehaviorSubject f179572e = BehaviorSubject.m23796g(new yne0("SLATE_HANDLER_ID"));

    public po21(Context context) {
        this.f179568a = context;
    }

    @Override // p204p.boe0
    /* JADX INFO: renamed from: a */
    public final Completable mo30086a(String str) {
        return new CompletableCreate(new b5y0(21, this, str));
    }

    @Override // p204p.boe0
    /* JADX INFO: renamed from: b */
    public final SingleSubject mo30087b(Object obj, String str) {
        SingleSubject singleSubject = new SingleSubject();
        this.f179569b.put(str, (msj0) obj);
        int i = SlateMessageHostActivity.f5513d1;
        Context context = this.f179568a;
        Intent intentM43990o = g95.m43990o(context, str);
        intentM43990o.setFlags(268435456);
        context.startActivity(intentM43990o);
        this.f179570c.put(str, singleSubject);
        return singleSubject;
    }

    @Override // p204p.boe0
    public final String getId() {
        return "SLATE_HANDLER_ID";
    }

    @Override // p204p.boe0
    public final BehaviorSubject getState() {
        return this.f179572e;
    }
}
