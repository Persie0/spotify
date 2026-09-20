package p204p;

import android.os.Bundle;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class fhd0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69634a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f69635b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jhd0 f69636c;

    public /* synthetic */ fhd0(niz nizVar, jhd0 jhd0Var, int i) {
        this.f69634a = i;
        this.f69635b = nizVar;
        this.f69636c = jhd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        ehd0 ehd0Var;
        ihd0 ihd0Var;
        Object k7mVar;
        int streamMaxVolume;
        switch (this.f69634a) {
            case 0:
                if (fbkVar instanceof ehd0) {
                    ehd0Var = (ehd0) fbkVar;
                    int i = ehd0Var.f59546b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ehd0Var.f59546b = i - Integer.MIN_VALUE;
                    } else {
                        ehd0Var = new ehd0(this, fbkVar);
                    }
                } else {
                    ehd0Var = new ehd0(this, fbkVar);
                }
                Object obj2 = ehd0Var.f59545a;
                int i2 = ehd0Var.f59546b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    List<String> list = (List) obj;
                    wgd0 wgd0Var = this.f69636c.f112400g;
                    wgd0Var.getClass();
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    for (String str : list) {
                        acf acfVar = new acf(0);
                        acfVar.m25467b(new mxz0(str, Bundle.EMPTY));
                        acfVar.f14347f = wgd0Var.f251037a.getString(R.string.command_unavailable_name);
                        acfVar.f14345d = R.drawable.encore_icon_ban;
                        arrayList.add(acfVar.m25466a());
                    }
                    ehd0Var.f59546b = 1;
                    Object objEmit = this.f69635b.emit(arrayList, ehd0Var);
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
                if (fbkVar instanceof ihd0) {
                    ihd0Var = (ihd0) fbkVar;
                    int i3 = ihd0Var.f102258b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ihd0Var.f102258b = i3 - Integer.MIN_VALUE;
                    } else {
                        ihd0Var = new ihd0(this, fbkVar);
                    }
                } else {
                    ihd0Var = new ihd0(this, fbkVar);
                }
                Object obj3 = ihd0Var.f102257a;
                int i4 = ihd0Var.f102258b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    na0 na0Var = (na0) obj;
                    if (na0Var instanceof la0) {
                        la0 la0Var = (la0) na0Var;
                        k7mVar = new l7m(la0Var.f131206b, Integer.valueOf(la0Var.f131205a), la0Var.f131207c);
                    } else {
                        if (!(na0Var instanceof ka0) && !(na0Var instanceof ma0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z5p z5pVar = this.f69636c.f112403j;
                        int iM71693d = ((pz6) z5pVar.f279596a).m71693d();
                        try {
                            streamMaxVolume = ((pz6) z5pVar.f279596a).f183611a.getStreamMaxVolume(3);
                        } catch (NullPointerException unused) {
                            streamMaxVolume = 0;
                        }
                        k7mVar = new k7m(iM71693d, streamMaxVolume);
                    }
                    ihd0Var.f102258b = 1;
                    Object objEmit2 = this.f69635b.emit(k7mVar, ihd0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                    break;
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
