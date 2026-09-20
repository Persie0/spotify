package p204p;

import com.spotify.jam.internal.socialconnect.models.JamStatus;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes2.dex */
public final class ib60 {

    /* JADX INFO: renamed from: a */
    public final voi f100450a;

    /* JADX INFO: renamed from: b */
    public final khy0 f100451b;

    /* JADX INFO: renamed from: c */
    public final zv41 f100452c = jag1.m52819d(null);

    public ib60(voi voiVar, khy0 khy0Var) {
        this.f100450a = voiVar;
        this.f100451b = khy0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r7 == r5) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m50123a(ibk ibkVar) {
        gb60 gb60Var;
        if (ibkVar instanceof gb60) {
            gb60Var = (gb60) ibkVar;
            int i = gb60Var.f78211c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb60Var.f78211c = i - Integer.MIN_VALUE;
            } else {
                gb60Var = new gb60(this, ibkVar);
            }
        } else {
            gb60Var = new gb60(this, ibkVar);
        }
        Object objM86755t = gb60Var.f78209a;
        int i2 = gb60Var.f78211c;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            nzx0 nzx0VarM65833l = nxf1.m65833l(new ty20(this, fbkVar, 18));
            gb60Var.f78211c = 1;
            objM86755t = vyf1.m86755t(nzx0VarM65833l, gb60Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM86755t);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        JamStatus jamStatus = (JamStatus) objM86755t;
        ya60 ya60Var = new ya60(jamStatus.deviceBroadcastStatus, jamStatus.session, jamStatus.activeJoinRequest, jamStatus.requestQueue);
        zv41 zv41Var = this.f100452c;
        zv41Var.getClass();
        zv41Var.m97091m(null, ya60Var);
        return ya60Var;
        Single singleM56461i = this.f100451b.m56461i((String) objM86755t);
        gb60Var.f78211c = 2;
        objM86755t = zn91.m96567o(singleM56461i, gb60Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d1 -> B:34:0x00d4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m50124b(int r18, p204p.ibk r19) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ib60.m50124b(int, p.ibk):java.lang.Object");
    }
}
