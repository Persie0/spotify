package p204p;

import com.spotify.campaigns.rivevideo.preview.api.TerminalParamsException;
import com.spotify.wrapped.p194v1.proto.RiveAnimation;
import com.spotify.wrapped.p194v1.proto.RiveFont;
import com.spotify.wrapped.p194v1.proto.ShareAsset;
import com.spotify.wrapped.p194v1.proto.ShareAssetItemResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class mix0 {

    /* JADX INFO: renamed from: a */
    public final xi01 f144117a;

    /* JADX INFO: renamed from: b */
    public final z4l0 f144118b;

    /* JADX INFO: renamed from: c */
    public final uc5 f144119c;

    public mix0(xi01 xi01Var, z4l0 z4l0Var, uc5 uc5Var) {
        this.f144117a = xi01Var;
        this.f144118b = z4l0Var;
        this.f144119c = uc5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
    
        if (r10 == r6) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [p.y9r0] */
    /* JADX WARN: Type inference failed for: r10v14, types: [p.lhx0] */
    /* JADX WARN: Type inference failed for: r10v16, types: [p.uc5] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, p.mix0] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m61918a(String str, ibk ibkVar) {
        kix0 kix0Var;
        y9r0 y9r0Var;
        RiveAnimation riveAnimation;
        RiveAnimation riveAnimation2;
        if (ibkVar instanceof kix0) {
            kix0Var = (kix0) ibkVar;
            int i = kix0Var.f123137e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kix0Var.f123137e = i - Integer.MIN_VALUE;
            } else {
                kix0Var = new kix0(this, ibkVar);
            }
        } else {
            kix0Var = new kix0(this, ibkVar);
        }
        Object objM55042z = kix0Var.f123135c;
        int i2 = kix0Var.f123137e;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                y9r0Var = kix0Var.f123133a;
                bga.m29073P(objM55042z);
                riveAnimation = (RiveAnimation) objM55042z;
            } else if (i2 == 2) {
                y9r0Var = kix0Var.f123133a;
                bga.m29073P(objM55042z);
                riveAnimation = (RiveAnimation) objM55042z;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                riveAnimation2 = kix0Var.f123134b;
                bga.m29073P(objM55042z);
            }
            List list = (List) objM55042z;
            Object obj = qhx0.f188881a;
            ae50 ae50VarM23207o = riveAnimation2.m23207o();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM23207o, 10));
            Iterator it = ae50VarM23207o.iterator();
            while (it.hasNext()) {
                arrayList.add(((RiveFont) it.next()).getName());
            }
            return new jix0(riveAnimation2.getUrl(), list, l0y0.m57844z(arrayList));
        }
        bga.m29073P(objM55042z);
        mbr0 mbr0Var = (mbr0) kix0Var.getContext().mo26595B(mbr0.f141960c);
        y9r0 y9r0VarM61426r = mbr0Var != null ? mbr0Var.m61426r() : null;
        if (y9r0VarM61426r != null) {
            zmy zmyVar = new zmy(this, str, fbkVar, 26);
            kix0Var.f123133a = y9r0VarM61426r;
            kix0Var.f123137e = 1;
            Object objM93160c = y9r0VarM61426r.m93160c(zmyVar, kix0Var);
            if (objM93160c != yukVar) {
                y9r0 y9r0Var2 = y9r0VarM61426r;
                objM55042z = objM93160c;
                y9r0Var = y9r0Var2;
                riveAnimation = (RiveAnimation) objM55042z;
            }
        } else {
            kix0Var.f123133a = y9r0VarM61426r;
            kix0Var.f123137e = 2;
            Object objM61919b = m61919b(str, kix0Var);
            if (objM61919b != yukVar) {
                y9r0 y9r0Var3 = y9r0VarM61426r;
                objM55042z = objM61919b;
                y9r0Var = y9r0Var3;
                riveAnimation = (RiveAnimation) objM55042z;
            }
        }
        return yukVar;
        RiveAnimation riveAnimation3 = riveAnimation;
        ?? r10 = y9r0Var;
        riveAnimation2 = riveAnimation3;
        if (riveAnimation2 == null) {
            return null;
        }
        if (r10 != 0) {
            r10.m93161d(riveAnimation2.getUrl());
        }
        if (r10 == 0) {
            r10 = this.f144119c;
        }
        kix0Var.f123133a = null;
        kix0Var.f123134b = riveAnimation2;
        kix0Var.f123137e = 3;
        objM55042z = k0y0.m55042z(riveAnimation2, this.f144118b, r10, kix0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m61919b(String str, ibk ibkVar) {
        lix0 lix0Var;
        if (ibkVar instanceof lix0) {
            lix0Var = (lix0) ibkVar;
            int i = lix0Var.f133905c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lix0Var.f133905c = i - Integer.MIN_VALUE;
            } else {
                lix0Var = new lix0(this, ibkVar);
            }
        } else {
            lix0Var = new lix0(this, ibkVar);
        }
        Object objM91079a = lix0Var.f133903a;
        int i2 = lix0Var.f133905c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM91079a);
                xi01 xi01Var = this.f144117a;
                lix0Var.f133905c = 1;
                objM91079a = xi01Var.m91079a(str, lix0Var);
                yuk yukVar = yuk.f276404a;
                if (objM91079a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM91079a);
            }
            ShareAsset shareAssetM23218n = ((ShareAssetItemResponse) objM91079a).m23218n();
            if (shareAssetM23218n.m23216n() != 2) {
                return null;
            }
            return shareAssetM23218n.m23217p();
        } catch (HttpException e) {
            int i3 = e.f288164a;
            if (400 > i3 || i3 >= 500) {
                throw e;
            }
            throw new TerminalParamsException(edb.m38563l("Share asset not found (HTTP ", i3, ")"), e);
        }
    }
}
