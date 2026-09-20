package p204p;

import com.spotify.playlist.proto.C1203a;
import com.spotify.playlist.proto.C1204b;
import com.spotify.playlist.proto.ModificationRequest;
import java.util.Collections;
import spotify.playlist.esperanto.proto.RootlistModificationRequest;
import spotify.playlist.esperanto.proto.RootlistModificationResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class dsz implements yrz {

    /* JADX INFO: renamed from: a */
    public final sr6 f52676a;

    public dsz(sr6 sr6Var) {
        this.f52676a = sr6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m36789a(String str, String str2, ibk ibkVar) {
        zrz zrzVar;
        if (ibkVar instanceof zrz) {
            zrzVar = (zrz) ibkVar;
            int i = zrzVar.f285790d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrzVar.f285790d = i - Integer.MIN_VALUE;
            } else {
                zrzVar = new zrz(this, ibkVar);
            }
        } else {
            zrzVar = new zrz(this, ibkVar);
        }
        Object objM79036L = zrzVar.f285788b;
        int i2 = zrzVar.f285790d;
        if (i2 == 0) {
            bga.m29073P(objM79036L);
            C1204b c1204bM18488B = ModificationRequest.m18488B();
            c1204bM18488B.m18679B("create");
            c1204bM18488B.m18680C(false);
            c1204bM18488B.m18678A(str);
            c1204bM18488B.m18689w("start");
            ModificationRequest modificationRequest = (ModificationRequest) c1204bM18488B.build();
            lkx0 lkx0VarM97778p = RootlistModificationRequest.m97778p();
            lkx0VarM97778p.m59291q(modificationRequest);
            lkx0VarM97778p.m59290m(str2 == null ? "" : str2);
            RootlistModificationRequest rootlistModificationRequest = (RootlistModificationRequest) lkx0VarM97778p.build();
            zrzVar.f285787a = str2;
            zrzVar.f285790d = 1;
            objM79036L = this.f52676a.m79036L(rootlistModificationRequest, zrzVar);
            yuk yukVar = yuk.f276404a;
            if (objM79036L == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = zrzVar.f285787a;
            bga.m29073P(objM79036L);
        }
        RootlistModificationResponse rootlistModificationResponse = (RootlistModificationResponse) objM79036L;
        return qzb0.m74316p(rootlistModificationResponse.m97781o(), str2 != null ? str2 : "", new asz(rootlistModificationResponse, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m36790b(String str, ibk ibkVar, boolean z) {
        bsz bszVar;
        if (ibkVar instanceof bsz) {
            bszVar = (bsz) ibkVar;
            int i = bszVar.f30442d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bszVar.f30442d = i - Integer.MIN_VALUE;
            } else {
                bszVar = new bsz(this, ibkVar);
            }
        } else {
            bszVar = new bsz(this, ibkVar);
        }
        Object objM79036L = bszVar.f30440b;
        int i2 = bszVar.f30442d;
        if (i2 == 0) {
            bga.m29073P(objM79036L);
            C1204b c1204bM18488B = ModificationRequest.m18488B();
            c1204bM18488B.m18679B("remove");
            c1204bM18488B.m18682m(Collections.singletonList(str));
            c1204bM18488B.m18690x(z);
            ModificationRequest modificationRequest = (ModificationRequest) c1204bM18488B.build();
            lkx0 lkx0VarM97778p = RootlistModificationRequest.m97778p();
            lkx0VarM97778p.m59291q(modificationRequest);
            RootlistModificationRequest rootlistModificationRequest = (RootlistModificationRequest) lkx0VarM97778p.build();
            bszVar.f30439a = str;
            bszVar.f30442d = 1;
            objM79036L = this.f52676a.m79036L(rootlistModificationRequest, bszVar);
            yuk yukVar = yuk.f276404a;
            if (objM79036L == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = bszVar.f30439a;
            bga.m29073P(objM79036L);
        }
        return qzb0.m74316p(((RootlistModificationResponse) objM79036L).m97781o(), str, i4y.f98629L0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m36791c(String str, String str2, ibk ibkVar) {
        csz cszVar;
        if (ibkVar instanceof csz) {
            cszVar = (csz) ibkVar;
            int i = cszVar.f41722d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cszVar.f41722d = i - Integer.MIN_VALUE;
            } else {
                cszVar = new csz(this, ibkVar);
            }
        } else {
            cszVar = new csz(this, ibkVar);
        }
        Object objM79036L = cszVar.f41720b;
        int i2 = cszVar.f41722d;
        if (i2 == 0) {
            bga.m29073P(objM79036L);
            C1204b c1204bM18488B = ModificationRequest.m18488B();
            c1204bM18488B.m18679B("set");
            C1203a c1203aM18507s = ModificationRequest.Attributes.m18507s();
            c1203aM18507s.m18675r(str2);
            c1204bM18488B.m18688v((ModificationRequest.Attributes) c1203aM18507s.build());
            c1204bM18488B.m18684r(str);
            ModificationRequest modificationRequest = (ModificationRequest) c1204bM18488B.build();
            lkx0 lkx0VarM97778p = RootlistModificationRequest.m97778p();
            lkx0VarM97778p.m59291q(modificationRequest);
            RootlistModificationRequest rootlistModificationRequest = (RootlistModificationRequest) lkx0VarM97778p.build();
            cszVar.f41719a = str;
            cszVar.f41722d = 1;
            objM79036L = this.f52676a.m79036L(rootlistModificationRequest, cszVar);
            yuk yukVar = yuk.f276404a;
            if (objM79036L == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = cszVar.f41719a;
            bga.m29073P(objM79036L);
        }
        return qzb0.m74316p(((RootlistModificationResponse) objM79036L).m97781o(), str, i4y.f98630M0);
    }
}
