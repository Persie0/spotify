package p204p;

import com.spotify.userinteractivityservice.usercomments.p178v1.proto.GetReactionsCountResponse;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.ListReactionsResponse;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.ReactionCount;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.ReactionListDisplay;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.ReactionShowAuthorMetadata;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.ReactionUserAuthorMetadata;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hjf implements adu0 {

    /* JADX INFO: renamed from: a */
    public final chf f92039a;

    /* JADX INFO: renamed from: b */
    public final boolean f92040b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2524w8 f92041c;

    public hjf(chf chfVar, am4 am4Var) {
        this.f92039a = chfVar;
        this.f92040b = am4Var.m26383a();
        ufq0.f229859a.getClass();
        this.f92041c = tfq0.m80705a();
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: a */
    public final boolean mo25622a() {
        return this.f92040b;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: b */
    public final Object mo25623b(ju61 ju61Var, String str, mb61 mb61Var) {
        String strM54330a = ju61Var.m54330a();
        String strM54331b = ju61Var.m54331b();
        chf chfVar = this.f92039a;
        Object objM96565n = zn91.m96565n(chfVar.f38000c.m85803b(strM54331b, str).m23295g(new lje(chfVar, strM54331b, str, strM54330a, 1)), mb61Var);
        return objM96565n == yuk.f276404a ? objM96565n : w2a1.f247311a;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: c */
    public final List mo25624c() {
        return this.f92041c;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: d */
    public final Object mo25625d(ju61 ju61Var, fbk fbkVar) {
        String strM54330a = ju61Var.m54330a();
        String strM54331b = ju61Var.m54331b();
        chf chfVar = this.f92039a;
        Object objM96565n = zn91.m96565n(chfVar.f38000c.m85814v(strM54331b).m23295g(new bhf(chfVar, strM54331b, strM54330a)), fbkVar);
        return objM96565n == yuk.f276404a ? objM96565n : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.adu0
    /* JADX INFO: renamed from: e */
    public final Object mo25626e(ju61 ju61Var, String str, String str2, ibk ibkVar) {
        fjf fjfVar;
        pua1 pua1Var;
        if (ibkVar instanceof fjf) {
            fjfVar = (fjf) ibkVar;
            int i = fjfVar.f70213c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fjfVar.f70213c = i - Integer.MIN_VALUE;
            } else {
                fjfVar = new fjf(this, ibkVar);
            }
        } else {
            fjfVar = new fjf(this, ibkVar);
        }
        Object objM96567o = fjfVar.f70211a;
        int i2 = fjfVar.f70213c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleM85811q = this.f92039a.f38000c.m85811q(ju61Var.m54331b(), str, str2);
            fjfVar.f70213c = 1;
            objM96567o = zn91.m96567o(singleM85811q, fjfVar);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        ListReactionsResponse listReactionsResponse = (ListReactionsResponse) objM96567o;
        ae50<ReactionListDisplay> ae50VarM22202n = listReactionsResponse.m22202n();
        ArrayList arrayList = new ArrayList();
        for (ReactionListDisplay reactionListDisplay : ae50VarM22202n) {
            if (reactionListDisplay.m22221t()) {
                ReactionUserAuthorMetadata reactionUserAuthorMetadataM22219r = reactionListDisplay.m22219r();
                pua1Var = new pua1(new nua1(reactionUserAuthorMetadataM22219r.m22228p(), reactionUserAuthorMetadataM22219r.getUsername(), reactionUserAuthorMetadataM22219r.m22227o()), reactionListDisplay.m22217p(), reactionListDisplay.m22216o());
            } else if (reactionListDisplay.m22220s()) {
                ReactionShowAuthorMetadata reactionShowAuthorMetadataM22218q = reactionListDisplay.m22218q();
                pua1Var = new pua1(new mua1(reactionShowAuthorMetadataM22218q.m22224p(), reactionShowAuthorMetadataM22218q.m22225q(), reactionShowAuthorMetadataM22218q.m22223o()), reactionListDisplay.m22217p(), reactionListDisplay.m22216o());
            } else {
                pua1Var = null;
            }
            if (pua1Var != null) {
                arrayList.add(pua1Var);
            }
        }
        return new dpm0(arrayList, listReactionsResponse.getNextPageToken());
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: f */
    public final boolean mo25627f(ju61 ju61Var) {
        Object c6x0Var;
        Object c6x0Var2;
        try {
            c6x0Var = new gf41(ju61Var.m54331b());
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        gf41 gf41Var = (gf41) c6x0Var;
        if ((gf41Var != null ? gf41Var.f79270c : null) == df41.COMMENT) {
            try {
                c6x0Var2 = new gf41(ju61Var.m54330a());
            } catch (Throwable th2) {
                c6x0Var2 = new c6x0(th2);
            }
            if (c6x0Var2 instanceof c6x0) {
                c6x0Var2 = null;
            }
            gf41 gf41Var2 = (gf41) c6x0Var2;
            if ((gf41Var2 != null ? gf41Var2.f79270c : null) == df41.EPISODE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.adu0
    /* JADX INFO: renamed from: g */
    public final Serializable mo25628g(ju61 ju61Var, ibk ibkVar) {
        gjf gjfVar;
        if (ibkVar instanceof gjf) {
            gjfVar = (gjf) ibkVar;
            int i = gjfVar.f80446c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gjfVar.f80446c = i - Integer.MIN_VALUE;
            } else {
                gjfVar = new gjf(this, ibkVar);
            }
        } else {
            gjfVar = new gjf(this, ibkVar);
        }
        Object objM96567o = gjfVar.f80444a;
        int i2 = gjfVar.f80446c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleM85810o = this.f92039a.f38000c.m85810o(ju61Var.m54331b());
            gjfVar.f80446c = 1;
            objM96567o = zn91.m96567o(singleM85810o, gjfVar);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        ae50<ReactionCount> ae50VarM22189n = ((GetReactionsCountResponse) objM96567o).m22189n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM22189n, 10));
        for (ReactionCount reactionCount : ae50VarM22189n) {
            arrayList.add(new xcu0(reactionCount.m22214o(), reactionCount.m22213n()));
        }
        return arrayList;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: h */
    public final pk20 mo25629h(ju61 ju61Var, klu0 klu0Var) {
        return null;
    }
}
