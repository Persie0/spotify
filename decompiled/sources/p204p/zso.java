package p204p;

import com.spotify.musicvideos.listvideofirstimpl.VideoFirstProto$State;
import com.spotify.musicvideos.listvideofirstimpl.VideoFirstProto$UserState;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class zso implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285981a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f285982b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f285983c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f285984d;

    public /* synthetic */ zso(niz nizVar, String str, String str2, int i) {
        this.f285981a = i;
        this.f285982b = nizVar;
        this.f285983c = str;
        this.f285984d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:67:0x013b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        yso ysoVar;
        boolean zEquals;
        r3w0 r3w0Var;
        Object lhlVar;
        wvb1 wvb1Var;
        Map mapM15950p;
        Boolean bool;
        switch (this.f285981a) {
            case 0:
                if (fbkVar instanceof yso) {
                    ysoVar = (yso) fbkVar;
                    int i = ysoVar.f275846b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ysoVar.f275846b = i - Integer.MIN_VALUE;
                    } else {
                        ysoVar = new yso(this, fbkVar);
                    }
                } else {
                    ysoVar = new yso(this, fbkVar);
                }
                Object obj2 = ysoVar.f275845a;
                int i2 = ysoVar.f275846b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    y190 y190Var = ((z190) obj).f278265c;
                    if (y190Var instanceof w190) {
                        zEquals = false;
                    } else if (y190Var instanceof v190) {
                        zEquals = wj50.m88271j(((v190) y190Var).f236300a, this.f285983c);
                    } else {
                        if (!(y190Var instanceof x190)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zEquals = ((x190) y190Var).f257107a.equals(this.f285984d);
                    }
                    Boolean boolValueOf = Boolean.valueOf(zEquals);
                    ysoVar.f275846b = 1;
                    Object objEmit = this.f285982b.emit(boolValueOf, ysoVar);
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
            case 1:
                if (fbkVar instanceof r3w0) {
                    r3w0Var = (r3w0) fbkVar;
                    int i3 = r3w0Var.f195580b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        r3w0Var.f195580b = i3 - Integer.MIN_VALUE;
                    } else {
                        r3w0Var = new r3w0(this, fbkVar);
                    }
                } else {
                    r3w0Var = new r3w0(this, fbkVar);
                }
                Object obj3 = r3w0Var.f195579a;
                int i4 = r3w0Var.f195580b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    g26 g26Var = (g26) obj;
                    int i5 = 127;
                    String str = null;
                    if (g26Var instanceof d26) {
                        lhlVar = new khl(str, str, i5);
                    } else {
                        boolean z = g26Var instanceof f26;
                        String str2 = this.f285983c;
                        if (z && ((f26) g26Var).f65117a.equals(str2)) {
                            lhlVar = new mhl(this.f285983c, 0L, 0L, this.f285984d, null, null, null, null, null, false, null, 2032);
                        } else {
                            lhlVar = ((g26Var instanceof e26) && ((e26) g26Var).f55366a.equals(str2)) ? new lhl(this.f285983c, 0L, 0L, this.f285984d, null, null, null, null, null, false, null, 2032) : new khl(str, str, i5);
                        }
                    }
                    r3w0Var.f195580b = 1;
                    Object objEmit2 = this.f285982b.emit(lhlVar, r3w0Var);
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
            default:
                if (fbkVar instanceof wvb1) {
                    wvb1Var = (wvb1) fbkVar;
                    int i6 = wvb1Var.f255462b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        wvb1Var.f255462b = i6 - Integer.MIN_VALUE;
                    } else {
                        wvb1Var = new wvb1(this, fbkVar);
                    }
                } else {
                    wvb1Var = new wvb1(this, fbkVar);
                }
                Object obj4 = wvb1Var.f255461a;
                int i7 = wvb1Var.f255462b;
                if (i7 == 0) {
                    bga.m29073P(obj4);
                    VideoFirstProto$UserState videoFirstProto$UserState = (VideoFirstProto$UserState) ((VideoFirstProto$State) obj).m15947p().get(this.f285983c);
                    Boolean boolValueOf2 = Boolean.valueOf((videoFirstProto$UserState == null || (mapM15950p = videoFirstProto$UserState.m15950p()) == null || (bool = (Boolean) mapM15950p.get(this.f285984d)) == null) ? false : bool.booleanValue());
                    wvb1Var.f255462b = 1;
                    Object objEmit3 = this.f285982b.emit(boolValueOf2, wvb1Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
        }
    }
}
