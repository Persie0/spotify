package p204p;

import spotify.playlist.esperanto.proto.RootlistModificationResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class asz extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19525a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RootlistModificationResponse f19526b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ asz(RootlistModificationResponse rootlistModificationResponse, int i) {
        super(0);
        this.f19525a = i;
        this.f19526b = rootlistModificationResponse;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f19525a) {
            case 0:
                break;
        }
        return this.f19526b.m97780n().getUri();
    }
}
