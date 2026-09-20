package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class uv7 extends mb61 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f234381a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f234382b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f234383c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f234384d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f234385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv7(Object obj, fbk fbkVar, int i) {
        super(4, fbkVar);
        this.f234381a = i;
        this.f234385e = obj;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f234381a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                uv7 uv7Var = new uv7((zv7) this.f234385e, (fbk) obj4, 0);
                uv7Var.f234382b = zBooleanValue;
                uv7Var.f234383c = zBooleanValue2;
                uv7Var.f234384d = zBooleanValue3;
                return uv7Var.invokeSuspend(w2a1.f247311a);
            case 1:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                uv7 uv7Var2 = new uv7(this.f234384d, (fbk) obj4);
                uv7Var2.f234385e = (s1a0) obj;
                uv7Var2.f234382b = zBooleanValue4;
                uv7Var2.f234383c = zBooleanValue5;
                return uv7Var2.invokeSuspend(w2a1.f247311a);
            default:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj3).booleanValue();
                uv7 uv7Var3 = new uv7((xeo0) this.f234385e, (fbk) obj4, 2);
                uv7Var3.f234382b = zBooleanValue6;
                uv7Var3.f234383c = zBooleanValue7;
                uv7Var3.f234384d = zBooleanValue8;
                return uv7Var3.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f234381a) {
            case 0:
                boolean z = this.f234382b;
                boolean z2 = this.f234383c;
                boolean z3 = this.f234384d;
                bga.m29073P(obj);
                return Boolean.valueOf(!z3 && ((zv7) this.f234385e).f286636c.f20416a.getResources().getBoolean(R.bool.mixing_auto_mix_header_action_screen_supported) && z && z2);
            case 1:
                s1a0 s1a0Var = (s1a0) this.f234385e;
                boolean z4 = this.f234382b;
                boolean z5 = this.f234383c;
                bga.m29073P(obj);
                return Boolean.valueOf((s1a0Var instanceof r1a0) && (!z4 || this.f234384d) && !z5);
            default:
                boolean z6 = this.f234382b;
                boolean z7 = this.f234383c;
                boolean z8 = this.f234384d;
                bga.m29073P(obj);
                return new cfo0((xeo0) this.f234385e, z6, z7, z8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv7(boolean z, fbk fbkVar) {
        super(4, fbkVar);
        this.f234381a = 1;
        this.f234384d = z;
    }
}
