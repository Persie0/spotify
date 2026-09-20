package p204p;

import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableScanSeed;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class iab0 {

    /* JADX INFO: renamed from: a */
    public final FlowableRefCount f100212a;

    public iab0(qp3 qp3Var) {
        Flowable flowable = qp3Var.callStream("spotify.analyzer_esperanto.proto.AnalyzerService", "SubLoudness", Empty.m1933n()).map(net.f153099g).toFlowable(BackpressureStrategy.f7188b);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cyx cyxVar = cyx.f43388Y;
        flowable.getClass();
        this.f100212a = new FlowableRefCount(new FlowableScanSeed(flowable, Functions.m23431h(linkedHashMap), cyxVar).m23336Q());
    }
}
