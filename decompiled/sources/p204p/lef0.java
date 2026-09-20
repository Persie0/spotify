package p204p;

import android.view.View;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;

/* JADX INFO: loaded from: classes8.dex */
public final class lef0 implements ovf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132543a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TrackInfoView f132544b;

    public /* synthetic */ lef0(TrackInfoView trackInfoView, int i) {
        this.f132543a = i;
        this.f132544b = trackInfoView;
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        switch (this.f132543a) {
            case 0:
                this.f132544b.f6347W0 = gh00Var;
                break;
            default:
                this.f132544b.f6347W0 = gh00Var;
                break;
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        switch (this.f132543a) {
            case 0:
                this.f132544b.m16005x((dg81) obj);
                break;
            default:
                this.f132544b.m16005x((dg81) obj);
                break;
        }
    }

    @Override // p204p.clc1
    public final View getView() {
        switch (this.f132543a) {
            case 0:
                break;
        }
        return this.f132544b;
    }
}
