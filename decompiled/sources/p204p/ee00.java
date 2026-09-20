package p204p;

import com.spotify.mobile.android.spotlets.show.proto.ShowUnfinishedEpisodesRequest$Response;
import com.spotify.show_esperanto.proto.GetUnfinishedEpisodesResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ee00 implements ew50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58634a = 0;

    /* JADX INFO: renamed from: b */
    public final ArrayList f58635b;

    /* JADX INFO: renamed from: c */
    public final int f58636c;

    /* JADX INFO: renamed from: d */
    public final int f58637d;

    public ee00(ArrayList arrayList, GetUnfinishedEpisodesResponse getUnfinishedEpisodesResponse) {
        this.f58635b = arrayList;
        this.f58636c = getUnfinishedEpisodesResponse.m21219n().m97965o();
        this.f58637d = getUnfinishedEpisodesResponse.m21219n().m97965o();
    }

    @Override // p204p.ew50
    /* JADX INFO: renamed from: c */
    public final boolean mo38623c() {
        switch (this.f58634a) {
        }
        return false;
    }

    @Override // p204p.ew50
    /* JADX INFO: renamed from: d */
    public final int mo38624d() {
        switch (this.f58634a) {
            case 0:
                break;
        }
        return this.f58637d;
    }

    @Override // p204p.ew50
    /* JADX INFO: renamed from: e */
    public final int mo38625e() {
        switch (this.f58634a) {
            case 0:
                break;
        }
        return this.f58636c;
    }

    @Override // p204p.ew50
    public final List getItems() {
        switch (this.f58634a) {
            case 0:
                break;
        }
        return this.f58635b;
    }

    public ee00(ArrayList arrayList, ShowUnfinishedEpisodesRequest$Response showUnfinishedEpisodesRequest$Response) {
        this.f58635b = arrayList;
        this.f58636c = showUnfinishedEpisodesRequest$Response.m15557n();
        this.f58637d = showUnfinishedEpisodesRequest$Response.m15557n();
    }
}
