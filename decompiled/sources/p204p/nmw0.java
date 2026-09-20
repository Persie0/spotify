package p204p;

import java.util.ArrayList;
import java.util.List;
import spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesResponse;

/* JADX INFO: loaded from: classes9.dex */
public final class nmw0 implements ew50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156274a = 0;

    /* JADX INFO: renamed from: b */
    public final ArrayList f156275b;

    /* JADX INFO: renamed from: c */
    public final boolean f156276c;

    /* JADX INFO: renamed from: d */
    public final int f156277d;

    /* JADX INFO: renamed from: e */
    public final int f156278e;

    public nmw0(ArrayList arrayList, ew50 ew50Var) {
        this.f156275b = arrayList;
        this.f156276c = ew50Var.mo38623c();
        this.f156277d = arrayList.size();
        this.f156278e = arrayList.size();
    }

    @Override // p204p.ew50
    /* JADX INFO: renamed from: c */
    public final boolean mo38623c() {
        switch (this.f156274a) {
            case 0:
                break;
        }
        return this.f156276c;
    }

    @Override // p204p.ew50
    /* JADX INFO: renamed from: d */
    public final int mo38624d() {
        switch (this.f156274a) {
            case 0:
                break;
        }
        return this.f156278e;
    }

    @Override // p204p.ew50
    /* JADX INFO: renamed from: e */
    public final int mo38625e() {
        switch (this.f156274a) {
            case 0:
                break;
        }
        return this.f156277d;
    }

    @Override // p204p.ew50
    public final List getItems() {
        switch (this.f156274a) {
            case 0:
                break;
        }
        return this.f156275b;
    }

    public nmw0(ArrayList arrayList, CollectionGetUnplayedEpisodesResponse collectionGetUnplayedEpisodesResponse) {
        this.f156275b = arrayList;
        this.f156276c = collectionGetUnplayedEpisodesResponse.m97516o();
        this.f156277d = collectionGetUnplayedEpisodesResponse.m97517p();
        this.f156278e = collectionGetUnplayedEpisodesResponse.m97518q();
    }
}
