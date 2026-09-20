package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: renamed from: p.dn */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1784dn implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50643a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ com.spotify.mobius.functions.Consumer f50644b;

    public /* synthetic */ C1784dn(com.spotify.mobius.functions.Consumer consumer, int i) {
        this.f50643a = i;
        this.f50644b = consumer;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f50643a) {
            case 0:
                this.f50644b.accept((InterfaceC2183nn) obj);
                break;
            case 1:
                this.f50644b.accept(C1911gv.f84576a);
                break;
            case 2:
                this.f50644b.accept((fz0) obj);
                break;
            case 3:
                this.f50644b.accept(h72.f88319a);
                break;
            case 4:
                this.f50644b.accept((hc2) obj);
                break;
            case 5:
                this.f50644b.accept((hc2) obj);
                break;
            case 6:
                this.f50644b.accept((ig3) obj);
                break;
            case 7:
                this.f50644b.accept((List) obj);
                break;
            case 8:
                e5c e5cVar = (e5c) obj;
                this.f50644b.accept(new a9c(e5cVar.f56342a, e5cVar.f56343b));
                break;
            case 9:
                this.f50644b.accept(new y8c(((u4c) obj).f226644a));
                break;
            case 10:
                this.f50644b.accept(new b9c(((f5c) obj).f66021a));
                break;
            case 11:
                this.f50644b.accept(new z8c(((d5c) obj).f45390a));
                break;
            case 12:
                this.f50644b.accept((o7e) obj);
                break;
            case 13:
                this.f50644b.accept((w1f) obj);
                break;
            case 14:
                this.f50644b.accept((mif) obj);
                break;
            case 15:
                this.f50644b.accept((t2x) obj);
                break;
            case 16:
                this.f50644b.accept(obj);
                break;
            case 17:
                bnj bnjVar = (bnj) obj;
                this.f50644b.accept(new yrj(bnjVar.f28843a, bnjVar.f28844b));
                break;
            case 18:
                this.f50644b.accept(new csj(((nnj) obj).f156436a));
                break;
            case 19:
                anj anjVar = (anj) obj;
                this.f50644b.accept(new xrj(anjVar.f17450a, anjVar.f17451b));
                break;
            case 20:
                mnj mnjVar = (mnj) obj;
                this.f50644b.accept(new bsj(mnjVar.f145435a, mnjVar.f145436b));
                break;
            case 21:
                this.f50644b.accept((pwk) obj);
                break;
            case 22:
                this.f50644b.accept((ig3) obj);
                break;
            case 23:
                this.f50644b.accept((av80) obj);
                break;
            case 24:
                this.f50644b.accept((nmt) obj);
                break;
            case 25:
                this.f50644b.accept((w1x) obj);
                break;
            case 26:
                this.f50644b.accept((w1x) obj);
                break;
            case 27:
                this.f50644b.accept((ig3) obj);
                break;
            case 28:
                this.f50644b.accept((wy10) obj);
                break;
            default:
                Logger.m3965a("[LiveSharing] User kicked by host: " + ((pj31) obj), new Object[0]);
                this.f50644b.accept(hq90.f94071a);
                break;
        }
    }
}
