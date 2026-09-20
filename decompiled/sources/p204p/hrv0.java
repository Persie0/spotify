package p204p;

import com.spotify.campfire.datasource.impl.proto.ActivityRequest;
import com.spotify.campfire.datasource.impl.proto.DeleteActivity;
import com.spotify.campfire.datasource.impl.proto.EmojiReaction;
import com.spotify.campfire.datasource.impl.proto.MessageRequest;
import com.spotify.campfire.datasource.impl.proto.NodeRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class hrv0 {

    /* JADX INFO: renamed from: a */
    public final e3p f94544a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m48409a(String str, ibk ibkVar) {
        grv0 grv0Var;
        if (ibkVar instanceof grv0) {
            grv0Var = (grv0) ibkVar;
            int i = grv0Var.f83841c;
            if ((i & Integer.MIN_VALUE) != 0) {
                grv0Var.f83841c = i - Integer.MIN_VALUE;
            } else {
                grv0Var = new grv0(this, ibkVar);
            }
        } else {
            grv0Var = new grv0(this, ibkVar);
        }
        Object obj = grv0Var.f83839a;
        int i2 = grv0Var.f83841c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                e3p e3pVar = this.f94544a;
                grv0Var.f83841c = 1;
                Object objM37657B = e3pVar.m37657B(str, grv0Var);
                yuk yukVar = yuk.f276404a;
                if (objM37657B == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m48410b(pcu0 pcu0Var, boolean z, ibk ibkVar) {
        rrz0 rrz0Var;
        if (ibkVar instanceof rrz0) {
            rrz0Var = (rrz0) ibkVar;
            int i = rrz0Var.f202146d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rrz0Var.f202146d = i - Integer.MIN_VALUE;
            } else {
                rrz0Var = new rrz0(this, ibkVar);
            }
        } else {
            rrz0Var = new rrz0(this, ibkVar);
        }
        Object obj = rrz0Var.f202144b;
        int i2 = rrz0Var.f202146d;
        Object c6x0Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                e3p e3pVar = this.f94544a;
                rrz0Var.f202143a = pcu0Var;
                rrz0Var.f202146d = 1;
                lmb lmbVar = e3pVar.f55841b;
                MessageRequest.Builder deleteActivity = MessageRequest.newBuilder().setDeleteActivity(DeleteActivity.newBuilder().setNodePathId(pcu0Var.f176230a).setRequest(ActivityRequest.newBuilder().setEmojiReaction(EmojiReaction.newBuilder().setEmojiUtf8(pcu0Var.f176231b))));
                wj50.m88279p(deleteActivity);
                NodeRequest.Builder messageRequest = NodeRequest.newBuilder().setMessageRequest(deleteActivity);
                wj50.m88279p(messageRequest);
                boolean z2 = !z;
                Object objM59325D = lmbVar.m59325D(new NodeRequest.Builder[]{messageRequest}, z2, z2, rrz0Var);
                yuk yukVar = yuk.f276404a;
                if (objM59325D != yukVar) {
                    objM59325D = c6x0Var;
                }
                if (objM59325D != yukVar) {
                    objM59325D = c6x0Var;
                }
                if (objM59325D == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pcu0Var = rrz0Var.f202143a;
                bga.m29073P(obj);
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            return c6x0Var;
        }
        return pcu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m48411c(String str, String str2, ibk ibkVar, boolean z) {
        srz0 srz0Var;
        if (ibkVar instanceof srz0) {
            srz0Var = (srz0) ibkVar;
            int i = srz0Var.f213436c;
            if ((i & Integer.MIN_VALUE) != 0) {
                srz0Var.f213436c = i - Integer.MIN_VALUE;
            } else {
                srz0Var = new srz0(this, ibkVar);
            }
        } else {
            srz0Var = new srz0(this, ibkVar);
        }
        Object objM59326E = srz0Var.f213434a;
        int i2 = srz0Var.f213436c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM59326E);
                e3p e3pVar = this.f94544a;
                srz0Var.f213436c = 1;
                objM59326E = e3pVar.f55841b.m59326E(str, str2, srz0Var, z);
                yuk yukVar = yuk.f276404a;
                if (objM59326E == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM59326E);
            }
            return (pcu0) objM59326E;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }
}
