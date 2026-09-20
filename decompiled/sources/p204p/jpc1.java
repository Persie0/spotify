package p204p;

import android.content.Intent;
import com.spotify.audiorecognition.p030v1.AudioChunk;
import com.spotify.audiorecognition.p030v1.AudioRecognitionRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class jpc1 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f114612b;

    public /* synthetic */ jpc1(niz nizVar, int i) {
        this.f114611a = i;
        this.f114612b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:133:0x021e  */
    /* JADX WARN: Code duplicated, block: B:149:0x025b  */
    /* JADX WARN: Code duplicated, block: B:168:0x029a  */
    /* JADX WARN: Code duplicated, block: B:184:0x02da  */
    /* JADX WARN: Code duplicated, block: B:200:0x0315  */
    /* JADX WARN: Code duplicated, block: B:216:0x0352  */
    /* JADX WARN: Code duplicated, block: B:232:0x038f  */
    /* JADX WARN: Code duplicated, block: B:251:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:271:0x0424  */
    /* JADX WARN: Code duplicated, block: B:291:0x0468  */
    /* JADX WARN: Code duplicated, block: B:309:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:329:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:349:0x0540  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:367:0x0582  */
    /* JADX WARN: Code duplicated, block: B:386:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:412:0x0634  */
    /* JADX WARN: Code duplicated, block: B:430:0x0672  */
    /* JADX WARN: Code duplicated, block: B:446:0x06af  */
    /* JADX WARN: Code duplicated, block: B:466:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:487:0x073b  */
    /* JADX WARN: Code duplicated, block: B:506:0x0785  */
    /* JADX WARN: Code duplicated, block: B:526:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:562:0x0849  */
    /* JADX WARN: Code duplicated, block: B:83:0x015e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        ipc1 ipc1Var;
        Object objEmit;
        quc1 quc1Var;
        vuc1 vuc1Var;
        w0d1 w0d1Var;
        x9d1 x9d1Var;
        bdd1 bdd1Var;
        cdd1 cdd1Var;
        fkd1 fkd1Var;
        xsd1 xsd1Var;
        atd1 atd1Var;
        rtd1 rtd1Var;
        ttd1 ttd1Var;
        utd1 utd1Var;
        wtd1 wtd1Var;
        xtd1 xtd1Var;
        ztd1 ztd1Var;
        k1e1 k1e1Var;
        g3e1 g3e1Var;
        l3e1 l3e1Var;
        u6e1 u6e1Var;
        d7e1 d7e1Var;
        j9e1 j9e1Var;
        r9e1 r9e1Var;
        s9e1 s9e1Var;
        t9e1 t9e1Var;
        x9e1 x9e1Var;
        Object qiaVar;
        Integer numValueOf;
        zs6 zs6Var;
        y9e1 y9e1Var;
        int i = this.f114611a;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar = this.f114612b;
        Object obj2 = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof ipc1) {
                    ipc1Var = (ipc1) fbkVar;
                    int i2 = ipc1Var.f104471b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ipc1Var.f104471b = i2 - Integer.MIN_VALUE;
                    } else {
                        ipc1Var = new ipc1(this, fbkVar);
                    }
                } else {
                    ipc1Var = new ipc1(this, fbkVar);
                }
                Object obj3 = ipc1Var.f104470a;
                int i3 = ipc1Var.f104471b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                Object obj4 = ((c2x) obj).f33482c;
                ipc1Var.f104471b = 1;
                return nizVar.emit(obj4, ipc1Var) == obj2 ? obj2 : w2a1Var;
            case 1:
                oy31 oy31Var = (oy31) obj;
                if (oy31Var instanceof ny31) {
                    return w2a1Var;
                }
                if (oy31Var instanceof ky31) {
                    objEmit = nizVar.emit(xsc1.f265563a, fbkVar);
                    if (objEmit != obj2) {
                        return w2a1Var;
                    }
                } else if (oy31Var instanceof my31) {
                    objEmit = nizVar.emit(new zsc1(((my31) oy31Var).f148303a), fbkVar);
                    if (objEmit != obj2) {
                        return w2a1Var;
                    }
                } else {
                    if (!(oy31Var instanceof ly31)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objEmit = nizVar.emit(ysc1.f275744a, fbkVar);
                    if (objEmit != obj2) {
                        return w2a1Var;
                    }
                }
                return objEmit;
            case 2:
                if (fbkVar instanceof quc1) {
                    quc1Var = (quc1) fbkVar;
                    int i4 = quc1Var.f192639b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        quc1Var.f192639b = i4 - Integer.MIN_VALUE;
                    } else {
                        quc1Var = new quc1(this, fbkVar);
                    }
                } else {
                    quc1Var = new quc1(this, fbkVar);
                }
                Object obj5 = quc1Var.f192638a;
                int i5 = quc1Var.f192639b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return w2a1Var;
                }
                bga.m29073P(obj5);
                Object f = new Float((((Number) obj).floatValue() * 0.8f) + 0.2f);
                quc1Var.f192639b = 1;
                return nizVar.emit(f, quc1Var) == obj2 ? obj2 : w2a1Var;
            case 3:
                if (fbkVar instanceof vuc1) {
                    vuc1Var = (vuc1) fbkVar;
                    int i6 = vuc1Var.f244924b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        vuc1Var.f244924b = i6 - Integer.MIN_VALUE;
                    } else {
                        vuc1Var = new vuc1(this, fbkVar);
                    }
                } else {
                    vuc1Var = new vuc1(this, fbkVar);
                }
                Object obj6 = vuc1Var.f244923a;
                int i7 = vuc1Var.f244924b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                oy31 oy31Var2 = (oy31) obj;
                if (!(oy31Var2 instanceof ky31) && !(oy31Var2 instanceof ly31)) {
                    return w2a1Var;
                }
                vuc1Var.f244924b = 1;
                return nizVar.emit(obj, vuc1Var) == obj2 ? obj2 : w2a1Var;
            case 4:
                if (fbkVar instanceof w0d1) {
                    w0d1Var = (w0d1) fbkVar;
                    int i8 = w0d1Var.f246704b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        w0d1Var.f246704b = i8 - Integer.MIN_VALUE;
                    } else {
                        w0d1Var = new w0d1(this, fbkVar);
                    }
                } else {
                    w0d1Var = new w0d1(this, fbkVar);
                }
                Object obj7 = w0d1Var.f246703a;
                int i9 = w0d1Var.f246704b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                Object objValueOf = Boolean.valueOf(((String) ((ty80) obj).f224877f.f271272q.get("voting_playlist_data")) != null);
                w0d1Var.f246704b = 1;
                return nizVar.emit(objValueOf, w0d1Var) == obj2 ? obj2 : w2a1Var;
            case 5:
                if (fbkVar instanceof x9d1) {
                    x9d1Var = (x9d1) fbkVar;
                    int i10 = x9d1Var.f259336b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        x9d1Var.f259336b = i10 - Integer.MIN_VALUE;
                    } else {
                        x9d1Var = new x9d1(this, fbkVar);
                    }
                } else {
                    x9d1Var = new x9d1(this, fbkVar);
                }
                Object obj8 = x9d1Var.f259335a;
                int i11 = x9d1Var.f259336b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                qho qhoVar = (qho) obj;
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                Object objValueOf2 = Boolean.valueOf(ohoVar != null ? ((Boolean) ohoVar.f165512a).booleanValue() : false);
                x9d1Var.f259336b = 1;
                return nizVar.emit(objValueOf2, x9d1Var) == obj2 ? obj2 : w2a1Var;
            case 6:
                if (fbkVar instanceof bdd1) {
                    bdd1Var = (bdd1) fbkVar;
                    int i12 = bdd1Var.f26084b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        bdd1Var.f26084b = i12 - Integer.MIN_VALUE;
                    } else {
                        bdd1Var = new bdd1(this, fbkVar);
                    }
                } else {
                    bdd1Var = new bdd1(this, fbkVar);
                }
                Object obj9 = bdd1Var.f26083a;
                int i13 = bdd1Var.f26084b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                    return w2a1Var;
                }
                bga.m29073P(obj9);
                dgd1 dgd1Var = (dgd1) obj;
                if (!(dgd1Var instanceof bgd1) && !(dgd1Var instanceof agd1)) {
                    return w2a1Var;
                }
                bdd1Var.f26084b = 1;
                return nizVar.emit(obj, bdd1Var) == obj2 ? obj2 : w2a1Var;
            case 7:
                if (fbkVar instanceof cdd1) {
                    cdd1Var = (cdd1) fbkVar;
                    int i14 = cdd1Var.f36873b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        cdd1Var.f36873b = i14 - Integer.MIN_VALUE;
                    } else {
                        cdd1Var = new cdd1(this, fbkVar);
                    }
                } else {
                    cdd1Var = new cdd1(this, fbkVar);
                }
                Object obj10 = cdd1Var.f36872a;
                int i15 = cdd1Var.f36873b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                    return w2a1Var;
                }
                bga.m29073P(obj10);
                Object objValueOf3 = Boolean.valueOf(((dgd1) obj) instanceof agd1);
                cdd1Var.f36873b = 1;
                return nizVar.emit(objValueOf3, cdd1Var) == obj2 ? obj2 : w2a1Var;
            case 8:
                if (fbkVar instanceof fkd1) {
                    fkd1Var = (fkd1) fbkVar;
                    int i16 = fkd1Var.f70529b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        fkd1Var.f70529b = i16 - Integer.MIN_VALUE;
                    } else {
                        fkd1Var = new fkd1(this, fbkVar);
                    }
                } else {
                    fkd1Var = new fkd1(this, fbkVar);
                }
                Object obj11 = fkd1Var.f70528a;
                int i17 = fkd1Var.f70529b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                    return w2a1Var;
                }
                bga.m29073P(obj11);
                if (((String) obj).length() <= 0) {
                    return w2a1Var;
                }
                fkd1Var.f70529b = 1;
                return nizVar.emit(obj, fkd1Var) == obj2 ? obj2 : w2a1Var;
            case 9:
                Object objEmit2 = nizVar.emit((k37) obj, fbkVar);
                return objEmit2 == obj2 ? objEmit2 : w2a1Var;
            case 10:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                wj50.m88279p(byteBuffer);
                l37 l37VarM3455r = AudioRecognitionRequest.m3455r();
                ev6 ev6VarM3452o = AudioChunk.m3452o();
                ev6VarM3452o.m40095m(gva.m45887e(byteBuffer.asReadOnlyBuffer()));
                l37VarM3455r.m57989m(ev6VarM3452o);
                Object objEmit3 = nizVar.emit((AudioRecognitionRequest) l37VarM3455r.build(), fbkVar);
                return objEmit3 == obj2 ? objEmit3 : w2a1Var;
            case 11:
                if (fbkVar instanceof xsd1) {
                    xsd1Var = (xsd1) fbkVar;
                    int i18 = xsd1Var.f265568b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        xsd1Var.f265568b = i18 - Integer.MIN_VALUE;
                    } else {
                        xsd1Var = new xsd1(this, fbkVar);
                    }
                } else {
                    xsd1Var = new xsd1(this, fbkVar);
                }
                Object obj12 = xsd1Var.f265567a;
                int i19 = xsd1Var.f265568b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return w2a1Var;
                }
                bga.m29073P(obj12);
                if (!(obj instanceof jwi)) {
                    return w2a1Var;
                }
                xsd1Var.f265568b = 1;
                return nizVar.emit(obj, xsd1Var) == obj2 ? obj2 : w2a1Var;
            case 12:
                if (fbkVar instanceof atd1) {
                    atd1Var = (atd1) fbkVar;
                    int i20 = atd1Var.f19660b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        atd1Var.f19660b = i20 - Integer.MIN_VALUE;
                    } else {
                        atd1Var = new atd1(this, fbkVar);
                    }
                } else {
                    atd1Var = new atd1(this, fbkVar);
                }
                Object obj13 = atd1Var.f19659a;
                int i21 = atd1Var.f19660b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                    return w2a1Var;
                }
                bga.m29073P(obj13);
                Object objValueOf4 = Boolean.valueOf(((Intent) obj).getIntExtra("wifi_state", -1) != 3);
                atd1Var.f19660b = 1;
                return nizVar.emit(objValueOf4, atd1Var) == obj2 ? obj2 : w2a1Var;
            case 13:
                if (fbkVar instanceof rtd1) {
                    rtd1Var = (rtd1) fbkVar;
                    int i22 = rtd1Var.f202569b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        rtd1Var.f202569b = i22 - Integer.MIN_VALUE;
                    } else {
                        rtd1Var = new rtd1(this, fbkVar);
                    }
                } else {
                    rtd1Var = new rtd1(this, fbkVar);
                }
                Object obj14 = rtd1Var.f202568a;
                int i23 = rtd1Var.f202569b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                if (((PlayerState) obj).contextUri().length() <= 0) {
                    return w2a1Var;
                }
                rtd1Var.f202569b = 1;
                return nizVar.emit(obj, rtd1Var) == obj2 ? obj2 : w2a1Var;
            case 14:
                if (fbkVar instanceof ttd1) {
                    ttd1Var = (ttd1) fbkVar;
                    int i24 = ttd1Var.f223579b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        ttd1Var.f223579b = i24 - Integer.MIN_VALUE;
                    } else {
                        ttd1Var = new ttd1(this, fbkVar);
                    }
                } else {
                    ttd1Var = new ttd1(this, fbkVar);
                }
                Object obj15 = ttd1Var.f223578a;
                int i25 = ttd1Var.f223579b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                    return w2a1Var;
                }
                bga.m29073P(obj15);
                PlayerState playerState = (PlayerState) obj;
                if (!playerState.isPlaying() || playerState.isPaused()) {
                    return w2a1Var;
                }
                ttd1Var.f223579b = 1;
                return nizVar.emit(obj, ttd1Var) == obj2 ? obj2 : w2a1Var;
            case 15:
                if (fbkVar instanceof utd1) {
                    utd1Var = (utd1) fbkVar;
                    int i26 = utd1Var.f233897b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        utd1Var.f233897b = i26 - Integer.MIN_VALUE;
                    } else {
                        utd1Var = new utd1(this, fbkVar);
                    }
                } else {
                    utd1Var = new utd1(this, fbkVar);
                }
                Object obj16 = utd1Var.f233896a;
                int i27 = utd1Var.f233897b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                    return w2a1Var;
                }
                bga.m29073P(obj16);
                PlayerState playerState2 = (PlayerState) obj;
                if (!playerState2.track().mo49279c() || e72.m37976J((ContextTrack) playerState2.track().mo49278b())) {
                    return w2a1Var;
                }
                utd1Var.f233897b = 1;
                return nizVar.emit(obj, utd1Var) == obj2 ? obj2 : w2a1Var;
            case 16:
                if (fbkVar instanceof wtd1) {
                    wtd1Var = (wtd1) fbkVar;
                    int i28 = wtd1Var.f254928b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        wtd1Var.f254928b = i28 - Integer.MIN_VALUE;
                    } else {
                        wtd1Var = new wtd1(this, fbkVar);
                    }
                } else {
                    wtd1Var = new wtd1(this, fbkVar);
                }
                Object obj17 = wtd1Var.f254927a;
                int i29 = wtd1Var.f254928b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return w2a1Var;
                }
                bga.m29073P(obj17);
                if (((PlayerState) obj).contextUri().length() <= 0) {
                    return w2a1Var;
                }
                wtd1Var.f254928b = 1;
                return nizVar.emit(obj, wtd1Var) == obj2 ? obj2 : w2a1Var;
            case 17:
                if (fbkVar instanceof xtd1) {
                    xtd1Var = (xtd1) fbkVar;
                    int i30 = xtd1Var.f265847b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        xtd1Var.f265847b = i30 - Integer.MIN_VALUE;
                    } else {
                        xtd1Var = new xtd1(this, fbkVar);
                    }
                } else {
                    xtd1Var = new xtd1(this, fbkVar);
                }
                Object obj18 = xtd1Var.f265846a;
                int i31 = xtd1Var.f265847b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return w2a1Var;
                }
                bga.m29073P(obj18);
                PlayerState playerState3 = (PlayerState) obj;
                if (!playerState3.isPlaying() || playerState3.isPaused()) {
                    return w2a1Var;
                }
                xtd1Var.f265847b = 1;
                return nizVar.emit(obj, xtd1Var) == obj2 ? obj2 : w2a1Var;
            case 18:
                if (fbkVar instanceof ztd1) {
                    ztd1Var = (ztd1) fbkVar;
                    int i32 = ztd1Var.f286141b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        ztd1Var.f286141b = i32 - Integer.MIN_VALUE;
                    } else {
                        ztd1Var = new ztd1(this, fbkVar);
                    }
                } else {
                    ztd1Var = new ztd1(this, fbkVar);
                }
                Object obj19 = ztd1Var.f286140a;
                int i33 = ztd1Var.f286141b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                    return w2a1Var;
                }
                bga.m29073P(obj19);
                PlayerState playerState4 = (PlayerState) obj;
                if (!playerState4.track().mo49279c() || e72.m37976J((ContextTrack) playerState4.track().mo49278b())) {
                    return w2a1Var;
                }
                ztd1Var.f286141b = 1;
                return nizVar.emit(obj, ztd1Var) == obj2 ? obj2 : w2a1Var;
            case 19:
                if (fbkVar instanceof k1e1) {
                    k1e1Var = (k1e1) fbkVar;
                    int i34 = k1e1Var.f118308b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        k1e1Var.f118308b = i34 - Integer.MIN_VALUE;
                    } else {
                        k1e1Var = new k1e1(this, fbkVar);
                    }
                } else {
                    k1e1Var = new k1e1(this, fbkVar);
                }
                Object obj20 = k1e1Var.f118307a;
                int i35 = k1e1Var.f118308b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return w2a1Var;
                }
                bga.m29073P(obj20);
                h1e1 h1e1Var = (h1e1) g6f.m43745s0((List) obj);
                Object objM46429a = h1e1Var != null ? h1e1Var.m46429a() : null;
                k1e1Var.f118308b = 1;
                return nizVar.emit(objM46429a, k1e1Var) == obj2 ? obj2 : w2a1Var;
            case 20:
                if (fbkVar instanceof g3e1) {
                    g3e1Var = (g3e1) fbkVar;
                    int i36 = g3e1Var.f76198b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        g3e1Var.f76198b = i36 - Integer.MIN_VALUE;
                    } else {
                        g3e1Var = new g3e1(this, fbkVar);
                    }
                } else {
                    g3e1Var = new g3e1(this, fbkVar);
                }
                Object obj21 = g3e1Var.f76197a;
                int i37 = g3e1Var.f76198b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return w2a1Var;
                }
                bga.m29073P(obj21);
                Object objValueOf5 = Boolean.valueOf(((u3e1) obj).f226366a);
                g3e1Var.f76198b = 1;
                return nizVar.emit(objValueOf5, g3e1Var) == obj2 ? obj2 : w2a1Var;
            case 21:
                if (fbkVar instanceof l3e1) {
                    l3e1Var = (l3e1) fbkVar;
                    int i38 = l3e1Var.f129318b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        l3e1Var.f129318b = i38 - Integer.MIN_VALUE;
                    } else {
                        l3e1Var = new l3e1(this, fbkVar);
                    }
                } else {
                    l3e1Var = new l3e1(this, fbkVar);
                }
                Object obj22 = l3e1Var.f129317a;
                int i39 = l3e1Var.f129318b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    return w2a1Var;
                }
                bga.m29073P(obj22);
                Object objValueOf6 = Boolean.valueOf(((u3e1) obj).f226366a);
                l3e1Var.f129318b = 1;
                return nizVar.emit(objValueOf6, l3e1Var) == obj2 ? obj2 : w2a1Var;
            case 22:
                if (fbkVar instanceof u6e1) {
                    u6e1Var = (u6e1) fbkVar;
                    int i40 = u6e1Var.f227309b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        u6e1Var.f227309b = i40 - Integer.MIN_VALUE;
                    } else {
                        u6e1Var = new u6e1(this, fbkVar);
                    }
                } else {
                    u6e1Var = new u6e1(this, fbkVar);
                }
                Object obj23 = u6e1Var.f227308a;
                int i41 = u6e1Var.f227309b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                    return w2a1Var;
                }
                bga.m29073P(obj23);
                Object objM37076y = dv9.m37076y((v8e1) obj);
                u6e1Var.f227309b = 1;
                return nizVar.emit(objM37076y, u6e1Var) == obj2 ? obj2 : w2a1Var;
            case 23:
                if (fbkVar instanceof d7e1) {
                    d7e1Var = (d7e1) fbkVar;
                    int i42 = d7e1Var.f46092b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        d7e1Var.f46092b = i42 - Integer.MIN_VALUE;
                    } else {
                        d7e1Var = new d7e1(this, fbkVar);
                    }
                } else {
                    d7e1Var = new d7e1(this, fbkVar);
                }
                Object obj24 = d7e1Var.f46091a;
                int i43 = d7e1Var.f46092b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var;
                }
                bga.m29073P(obj24);
                Object g8e1Var = new g8e1(((Boolean) obj).booleanValue());
                d7e1Var.f46092b = 1;
                return nizVar.emit(g8e1Var, d7e1Var) == obj2 ? obj2 : w2a1Var;
            case 24:
                if (fbkVar instanceof j9e1) {
                    j9e1Var = (j9e1) fbkVar;
                    int i44 = j9e1Var.f110157b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        j9e1Var.f110157b = i44 - Integer.MIN_VALUE;
                    } else {
                        j9e1Var = new j9e1(this, fbkVar);
                    }
                } else {
                    j9e1Var = new j9e1(this, fbkVar);
                }
                Object obj25 = j9e1Var.f110156a;
                int i45 = j9e1Var.f110157b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                    return w2a1Var;
                }
                bga.m29073P(obj25);
                Object obj26 = (Set) ((gv31) obj).f84602a;
                if (obj26 == null) {
                    obj26 = gbu.f78413a;
                }
                j9e1Var.f110157b = 1;
                return nizVar.emit(obj26, j9e1Var) == obj2 ? obj2 : w2a1Var;
            case 25:
                if (fbkVar instanceof r9e1) {
                    r9e1Var = (r9e1) fbkVar;
                    int i46 = r9e1Var.f197041b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        r9e1Var.f197041b = i46 - Integer.MIN_VALUE;
                    } else {
                        r9e1Var = new r9e1(this, fbkVar);
                    }
                } else {
                    r9e1Var = new r9e1(this, fbkVar);
                }
                Object obj27 = r9e1Var.f197040a;
                int i47 = r9e1Var.f197041b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return w2a1Var;
                }
                bga.m29073P(obj27);
                Object objValueOf7 = Boolean.valueOf(((u3e1) obj).f226366a);
                r9e1Var.f197041b = 1;
                return nizVar.emit(objValueOf7, r9e1Var) == obj2 ? obj2 : w2a1Var;
            case 26:
                if (fbkVar instanceof s9e1) {
                    s9e1Var = (s9e1) fbkVar;
                    int i48 = s9e1Var.f206936b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        s9e1Var.f206936b = i48 - Integer.MIN_VALUE;
                    } else {
                        s9e1Var = new s9e1(this, fbkVar);
                    }
                } else {
                    s9e1Var = new s9e1(this, fbkVar);
                }
                Object obj28 = s9e1Var.f206935a;
                int i49 = s9e1Var.f206936b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var;
                }
                bga.m29073P(obj28);
                Object objContextUri = ((PlayerState) obj).contextUri();
                s9e1Var.f206936b = 1;
                return nizVar.emit(objContextUri, s9e1Var) == obj2 ? obj2 : w2a1Var;
            case 27:
                if (fbkVar instanceof t9e1) {
                    t9e1Var = (t9e1) fbkVar;
                    int i50 = t9e1Var.f218280b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        t9e1Var.f218280b = i50 - Integer.MIN_VALUE;
                    } else {
                        t9e1Var = new t9e1(this, fbkVar);
                    }
                } else {
                    t9e1Var = new t9e1(this, fbkVar);
                }
                Object obj29 = t9e1Var.f218279a;
                int i51 = t9e1Var.f218280b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var;
                }
                bga.m29073P(obj29);
                Object objValueOf8 = Boolean.valueOf(((u3e1) obj).f226366a);
                t9e1Var.f218280b = 1;
                return nizVar.emit(objValueOf8, t9e1Var) == obj2 ? obj2 : w2a1Var;
            case 28:
                if (fbkVar instanceof x9e1) {
                    x9e1Var = (x9e1) fbkVar;
                    int i52 = x9e1Var.f259343b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        x9e1Var.f259343b = i52 - Integer.MIN_VALUE;
                    } else {
                        x9e1Var = new x9e1(this, fbkVar);
                    }
                } else {
                    x9e1Var = new x9e1(this, fbkVar);
                }
                Object obj30 = x9e1Var.f259342a;
                int i53 = x9e1Var.f259343b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return w2a1Var;
                }
                bga.m29073P(obj30);
                ArrayList<qho> arrayList = new ArrayList();
                for (qho qhoVar2 : (List) obj) {
                    oho ohoVar2 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                    qho qhoVar3 = ohoVar2 != null ? (qho) ohoVar2.f165512a : null;
                    if (qhoVar3 != null) {
                        arrayList.add(qhoVar3);
                    }
                }
                if (arrayList.isEmpty()) {
                    qiaVar = ria.f199468a;
                } else {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            qho qhoVar4 = (qho) it.next();
                            if ((qhoVar4 instanceof oho) || ((qhoVar4 instanceof nho) && !(((nho) qhoVar4).f154041a instanceof ffo))) {
                                ArrayList arrayList2 = new ArrayList();
                                for (qho qhoVar5 : arrayList) {
                                    oho ohoVar3 = qhoVar5 instanceof oho ? (oho) qhoVar5 : null;
                                    if (ohoVar3 == null || (zs6Var = (zs6) ohoVar3.f165512a) == null) {
                                        numValueOf = null;
                                    } else {
                                        double d = zs6Var.f285849a;
                                        if (Math.abs(d) <= Double.MAX_VALUE) {
                                            int iM72082M = q3d0.m72082M(d);
                                            numValueOf = Integer.valueOf(iM72082M);
                                            if (1 > iM72082M || iM72082M >= 1000) {
                                                numValueOf = null;
                                            }
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                    if (numValueOf != null) {
                                        arrayList2.add(numValueOf);
                                    }
                                }
                                qiaVar = new qia(arrayList2.isEmpty() ? null : new cia(((Number) g6f.m43695I0(arrayList2)).intValue(), ((Number) g6f.m43692F0(arrayList2)).intValue()));
                            }
                        } else {
                            qiaVar = ria.f199468a;
                        }
                    }
                }
                x9e1Var.f259343b = 1;
                return nizVar.emit(qiaVar, x9e1Var) == obj2 ? obj2 : w2a1Var;
            default:
                if (fbkVar instanceof y9e1) {
                    y9e1Var = (y9e1) fbkVar;
                    int i54 = y9e1Var.f270582b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        y9e1Var.f270582b = i54 - Integer.MIN_VALUE;
                    } else {
                        y9e1Var = new y9e1(this, fbkVar);
                    }
                } else {
                    y9e1Var = new y9e1(this, fbkVar);
                }
                Object obj31 = y9e1Var.f270581a;
                int i55 = y9e1Var.f270582b;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                List list = ((t5a0) obj).f217256b;
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((s5a0) it2.next()).getUri());
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj32 : arrayList3) {
                    Set set = dd41.f47702f;
                    if (r46.m74726U((String) obj32).f47709c == gn80.TRACK) {
                        arrayList4.add(obj32);
                    }
                }
                Object objM43727j0 = g6f.m43727j0(arrayList4);
                y9e1Var.f270582b = 1;
                return nizVar.emit(objM43727j0, y9e1Var) == obj2 ? obj2 : w2a1Var;
        }
    }

    public /* synthetic */ jpc1(niz nizVar, Object obj, int i) {
        this.f114611a = i;
        this.f114612b = nizVar;
    }
}
