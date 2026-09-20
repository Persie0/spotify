package p204p;

import com.google.protobuf.FieldMask;
import com.spotify.player.model.ContextTrack;
import com.spotify.userhighlight.p177v1.UpdateUserHighlightRequest;
import com.spotify.userhighlight.p177v1.UserHighlightChange;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class sqa1 {

    /* JADX INFO: renamed from: a */
    public final tqa1 f213045a;

    /* JADX INFO: renamed from: b */
    public final epx f213046b;

    /* JADX INFO: renamed from: c */
    public final vpx f213047c;

    public sqa1(tqa1 tqa1Var, epx epxVar, vpx vpxVar) {
        this.f213045a = tqa1Var;
        this.f213046b = epxVar;
        this.f213047c = vpxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fb, code lost:
    
        if (p204p.zn91.m96567o(r1, r0) == r7) goto L37;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m78942a(u8t u8tVar, ibk ibkVar) {
        rqa1 rqa1Var;
        Object c6x0Var;
        u8t u8tVar2;
        Object obj;
        int i;
        if (ibkVar instanceof rqa1) {
            rqa1Var = (rqa1) ibkVar;
            int i2 = rqa1Var.f201788f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rqa1Var.f201788f = i2 - Integer.MIN_VALUE;
            } else {
                rqa1Var = new rqa1(this, ibkVar);
            }
        } else {
            rqa1Var = new rqa1(this, ibkVar);
        }
        Object obj2 = rqa1Var.f201786d;
        int i3 = rqa1Var.f201788f;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj2);
                aea1 aea1VarM22119p = UpdateUserHighlightRequest.m22119p();
                oqa1 oqa1VarM22125s = UserHighlightChange.m22125s();
                oqa1VarM22125s.m67614t(u8tVar.f228013a);
                oqa1VarM22125s.m67613s(u8tVar.f228014b);
                aea1VarM22119p.m25712m((UserHighlightChange) oqa1VarM22125s.build());
                juy juyVarM1939p = FieldMask.m1939p();
                juyVarM1939p.m54349m(ContextTrack.Metadata.KEY_TITLE);
                aea1VarM22119p.m25713q((FieldMask) juyVarM1939p.build());
                UpdateUserHighlightRequest updateUserHighlightRequest = (UpdateUserHighlightRequest) aea1VarM22119p.build();
                tqa1 tqa1Var = this.f213045a;
                String str = u8tVar.f228013a;
                wj50.m88279p(updateUserHighlightRequest);
                rqa1Var.f201783a = u8tVar;
                rqa1Var.f201784b = null;
                rqa1Var.f201785c = 0;
                rqa1Var.f201788f = 1;
                if (tqa1Var.m81311b(str, updateUserHighlightRequest, rqa1Var) == yukVar) {
                }
                return yukVar;
            }
            if (i3 == 1) {
                u8tVar = rqa1Var.f201783a;
                bga.m29073P(obj2);
            } else if (i3 == 2) {
                int i4 = rqa1Var.f201785c;
                Object obj3 = rqa1Var.f201784b;
                u8tVar2 = rqa1Var.f201783a;
                bga.m29073P(obj2);
                i = i4;
                obj = obj3;
                Single singleFirstOrError = ((jpx) this.f213046b).m53978b(new C1668ai("clip-identity-trait-cache-refresh", false, (gh00) new yaa1(u8tVar2, 5))).filter(snq0.f210998V0).firstOrError();
                rqa1Var.f201783a = null;
                rqa1Var.f201784b = obj;
                rqa1Var.f201785c = i;
                rqa1Var.f201788f = 3;
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = rqa1Var.f201784b;
                bga.m29073P(obj2);
            }
            return obj;
            c6x0Var = w2a1.f247311a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            return c6x0Var;
        }
        Completable completableM86176a = this.f213047c.m86176a(Collections.singletonList(u8tVar.f228013a), v140.class);
        rqa1Var.f201783a = u8tVar;
        rqa1Var.f201784b = c6x0Var;
        rqa1Var.f201785c = 0;
        rqa1Var.f201788f = 2;
        if (zn91.m96565n(completableM86176a, rqa1Var) != yukVar) {
            u8tVar2 = u8tVar;
            obj = c6x0Var;
            i = 0;
            Single singleFirstOrError2 = ((jpx) this.f213046b).m53978b(new C1668ai("clip-identity-trait-cache-refresh", false, (gh00) new yaa1(u8tVar2, 5))).filter(snq0.f210998V0).firstOrError();
            rqa1Var.f201783a = null;
            rqa1Var.f201784b = obj;
            rqa1Var.f201785c = i;
            rqa1Var.f201788f = 3;
        }
        return yukVar;
    }
}
