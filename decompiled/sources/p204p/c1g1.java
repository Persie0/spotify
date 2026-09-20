package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class c1g1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public final vah1 f33090l;

    /* JADX INFO: renamed from: m */
    public final ev61 f33091m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ r4g1 f33092n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1g1(r4g1 r4g1Var, ev61 ev61Var) {
        super(9);
        Objects.requireNonNull(r4g1Var);
        this.f33092n = r4g1Var;
        attachInterface(this, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
        this.f33090l = new vah1("OnCheckAgeSignalsCallback");
        this.f33091m = ev61Var;
    }
}
