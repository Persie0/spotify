package p204p;

import spotify.playlist.esperanto.proto.PlaylistGetResponse;
import spotify.playlist.esperanto.proto.PlaylistMembersResponse;
import spotify.playlist.esperanto.proto.ResponseStatus;

/* JADX INFO: loaded from: classes7.dex */
public final class hu80 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95344a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f95345b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f95346c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mu80 f95347d;

    public /* synthetic */ hu80(niz nizVar, String str, mu80 mu80Var, int i) {
        this.f95344a = i;
        this.f95345b = nizVar;
        this.f95346c = str;
        this.f95347d = mu80Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        gu80 gu80Var;
        ku80 ku80Var;
        switch (this.f95344a) {
            case 0:
                if (fbkVar instanceof gu80) {
                    gu80Var = (gu80) fbkVar;
                    int i = gu80Var.f84405b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gu80Var.f84405b = i - Integer.MIN_VALUE;
                    } else {
                        gu80Var = new gu80(this, fbkVar);
                    }
                } else {
                    gu80Var = new gu80(this, fbkVar);
                }
                Object obj2 = gu80Var.f84404a;
                int i2 = gu80Var.f84405b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    PlaylistGetResponse playlistGetResponse = (PlaylistGetResponse) obj;
                    p2x0 p2x0VarM74316p = qzb0.m74316p(playlistGetResponse.m97675r(), this.f95346c, new bu80(this.f95347d, playlistGetResponse, 3));
                    gu80Var.f84405b = 1;
                    Object objEmit = this.f95345b.emit(p2x0VarM74316p, gu80Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof ku80) {
                    ku80Var = (ku80) fbkVar;
                    int i3 = ku80Var.f126480b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ku80Var.f126480b = i3 - Integer.MIN_VALUE;
                    } else {
                        ku80Var = new ku80(this, fbkVar);
                    }
                } else {
                    ku80Var = new ku80(this, fbkVar);
                }
                Object obj3 = ku80Var.f126479a;
                int i4 = ku80Var.f126480b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    PlaylistMembersResponse playlistMembersResponse = (PlaylistMembersResponse) obj;
                    ResponseStatus responseStatusM97688o = playlistMembersResponse.m97688o();
                    String str = this.f95346c;
                    p2x0 p2x0VarM74316p2 = qzb0.m74316p(responseStatusM97688o, str, new k380(this.f95347d, str, playlistMembersResponse, 2));
                    ku80Var.f126480b = 1;
                    Object objEmit2 = this.f95345b.emit(p2x0VarM74316p2, ku80Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
