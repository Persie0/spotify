package p204p;

import android.view.View;
import com.spotify.music.R;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.BehaviorProcessor;

/* JADX INFO: loaded from: classes5.dex */
public final class qoc1 {

    /* JADX INFO: renamed from: a */
    public final hc80 f190911a;

    /* JADX INFO: renamed from: b */
    public final i6m0 f190912b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f190913c;

    public qoc1(hc80 hc80Var, i6m0 i6m0Var, slm slmVar, cic1 cic1Var) {
        this.f190911a = hc80Var;
        this.f190912b = i6m0Var;
        this.f190913c = slmVar;
    }

    /* JADX INFO: renamed from: a */
    public final ooc1 m73390a(View view, eh00 eh00Var) {
        fpc1 fpc1Var = (fpc1) this.f190913c.get();
        i6m0 i6m0Var = this.f190912b;
        d501 d501Var = new d501(new mq91(i6m0Var, i6m0Var, i6m0Var), 29);
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        poc1 poc1Var = new poc1(behaviorProcessor, fpc1Var);
        this.f190911a.getLifecycle().mo31986a(poc1Var);
        fpc1Var.m42329e(view, new qv31(new rlv0(), this, view, 29), new FlowableOnBackpressureLatest(behaviorProcessor.m23356t(Functions.f7225a)), new k8c1(d501Var, eh00Var), hhc1.f91342Y);
        kk6 kk6Var = new kk6(fpc1Var, 29);
        view.addOnLayoutChangeListener(kk6Var);
        return new ooc1(this, poc1Var, fpc1Var, view, kk6Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m73391b(View view) {
        view.setTag(R.id.view_ubi_impression_logger_container_tag, "TAG_CONTAINER_VIEW");
    }
}
