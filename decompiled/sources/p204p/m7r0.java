package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class m7r0 {

    /* JADX INFO: renamed from: e */
    public static final Object f140817e = kkc0.m56695h0(new pqm0(ContextTrack.Metadata.KEY_MEDIA_START_POSITION, "0"), new pqm0("type", "1"));

    /* JADX INFO: renamed from: a */
    public final nbm0 f140818a;

    /* JADX INFO: renamed from: b */
    public final uqw f140819b;

    /* JADX INFO: renamed from: c */
    public final hrw f140820c;

    /* JADX INFO: renamed from: d */
    public hun0 f140821d = new hun0((Map) null, (Map) null, 7);

    public m7r0(scn scnVar, nbm0 nbm0Var) {
        this.f140818a = nbm0Var;
        this.f140819b = scnVar.m77810d();
        this.f140820c = scnVar.m77807a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m61089a(Single single, ibk ibkVar) {
        i7r0 i7r0Var;
        if (ibkVar instanceof i7r0) {
            i7r0Var = (i7r0) ibkVar;
            int i = i7r0Var.f99613c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i7r0Var.f99613c = i - Integer.MIN_VALUE;
            } else {
                i7r0Var = new i7r0(this, ibkVar);
            }
        } else {
            i7r0Var = new i7r0(this, ibkVar);
        }
        Object objM96567o = i7r0Var.f99611a;
        int i2 = i7r0Var.f99613c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            i7r0Var.f99613c = 1;
            objM96567o = zn91.m96567o(single, i7r0Var);
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
        lcf lcfVar = (lcf) objM96567o;
        if (lcfVar instanceof icf) {
            return g7r0.f77335a;
        }
        return lcfVar instanceof hcf ? new f7r0(((hcf) lcfVar).f89783a) : new f7r0("Unknown error");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m61090b(String str, String str2, ibk ibkVar) {
        j7r0 j7r0Var;
        Context.Builder builder;
        List list;
        ContextPage.Builder builder2;
        if (ibkVar instanceof j7r0) {
            j7r0Var = (j7r0) ibkVar;
            int i = j7r0Var.f109658f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7r0Var.f109658f = i - Integer.MIN_VALUE;
            } else {
                j7r0Var = new j7r0(this, ibkVar);
            }
        } else {
            j7r0Var = new j7r0(this, ibkVar);
        }
        Object obj = j7r0Var.f109656d;
        int i2 = j7r0Var.f109658f;
        if (i2 == 0) {
            bga.m29073P(obj);
            Context.Builder builder3 = Context.builder(str);
            ContextPage.Builder builder4 = ContextPage.builder();
            List listSingletonList = Collections.singletonList(m61091c(str2, true));
            C1673an c1673an = (C1673an) this.f140821d.f95432c;
            j7r0Var.f109653a = builder3;
            j7r0Var.f109654b = builder4;
            j7r0Var.f109655c = listSingletonList;
            j7r0Var.f109658f = 1;
            c1673an.invoke(j7r0Var);
            yuk yukVar = yuk.f276404a;
            lau lauVar = lau.f131415a;
            if (lauVar == yukVar) {
                return yukVar;
            }
            builder = builder3;
            list = listSingletonList;
            builder2 = builder4;
            obj = lauVar;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = j7r0Var.f109655c;
            builder2 = j7r0Var.f109654b;
            builder = j7r0Var.f109653a;
            bga.m29073P(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m61091c((String) it.next(), false));
        }
        Context.Builder builderPages = builder.pages(Collections.singletonList(builder2.tracks(g6f.m43700N0(arrayList, list)).build()));
        Map<String, String> map = (Map) this.f140821d.f95431b;
        if (map == null) {
            map = nau.f152117a;
        }
        return builderPages.metadata(map).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public final ContextTrack m61091c(String str, boolean z) {
        ContextTrack.Builder builder = ContextTrack.builder(str);
        mec0 mec0Var = new mec0();
        Map map = (Map) this.f140821d.f95433d;
        if (map != null) {
            mec0Var.putAll(map);
        }
        if (z) {
            mec0Var.putAll(f140817e);
        }
        return builder.metadata(mec0Var.m61540b()).build();
    }

    /* JADX INFO: renamed from: d */
    public final LoggingParams m61092d(d850 d850Var) {
        z650 z650Var;
        LoggingParams.Builder builder = LoggingParams.builder();
        kbm0 kbm0Var = this.f140818a.get();
        String str = null;
        String str2 = kbm0Var != null ? kbm0Var.f121231a : null;
        if (str2 == null) {
            str2 = "";
        }
        LoggingParams.Builder builderPageInstanceId = builder.pageInstanceId(str2);
        if (d850Var != null && (z650Var = d850Var.f46380a) != null) {
            str = z650Var.f279709a;
        }
        return builderPageInstanceId.interactionId(str).build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m61093e(String str, String str2, d850 d850Var, ibk ibkVar) {
        k7r0 k7r0Var;
        uqw uqwVar;
        m7r0 m7r0Var;
        if (ibkVar instanceof k7r0) {
            k7r0Var = (k7r0) ibkVar;
            int i = k7r0Var.f120185e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k7r0Var.f120185e = i - Integer.MIN_VALUE;
            } else {
                k7r0Var = new k7r0(this, ibkVar);
            }
        } else {
            k7r0Var = new k7r0(this, ibkVar);
        }
        Object obj = k7r0Var.f120183c;
        int i2 = k7r0Var.f120185e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            k7r0Var.f120181a = this;
            uqw uqwVar2 = this.f140819b;
            k7r0Var.f120182b = uqwVar2;
            k7r0Var.f120185e = 1;
            Object objM61094f = m61094f(str, str2, d850Var, k7r0Var);
            if (objM61094f != yukVar) {
                obj = objM61094f;
                uqwVar = uqwVar2;
                m7r0Var = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        uqwVar = k7r0Var.f120182b;
        m7r0Var = k7r0Var.f120181a;
        bga.m29073P(obj);
        Single singleM83821a = uqwVar.m83821a((PlayCommand) obj);
        k7r0Var.f120181a = null;
        k7r0Var.f120182b = null;
        k7r0Var.f120185e = 2;
        Object objM61089a = m7r0Var.m61089a(singleM83821a, k7r0Var);
        return objM61089a == yukVar ? yukVar : objM61089a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m61094f(String str, String str2, d850 d850Var, ibk ibkVar) {
        l7r0 l7r0Var;
        String str3;
        m7r0 m7r0Var;
        if (ibkVar instanceof l7r0) {
            l7r0Var = (l7r0) ibkVar;
            int i = l7r0Var.f130726f;
            if ((i & Integer.MIN_VALUE) != 0) {
                l7r0Var.f130726f = i - Integer.MIN_VALUE;
            } else {
                l7r0Var = new l7r0(this, ibkVar);
            }
        } else {
            l7r0Var = new l7r0(this, ibkVar);
        }
        Object objM61090b = l7r0Var.f130724d;
        int i2 = l7r0Var.f130726f;
        if (i2 == 0) {
            bga.m29073P(objM61090b);
            l7r0Var.f130721a = str;
            l7r0Var.f130722b = d850Var;
            l7r0Var.f130723c = this;
            l7r0Var.f130726f = 1;
            objM61090b = m61090b(str2, str, l7r0Var);
            yuk yukVar = yuk.f276404a;
            if (objM61090b == yukVar) {
                return yukVar;
            }
            str3 = str;
            m7r0Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m7r0Var = l7r0Var.f130723c;
            d850Var = l7r0Var.f130722b;
            str3 = l7r0Var.f130721a;
            bga.m29073P(objM61090b);
        }
        PlayCommand.Builder builderLoggingParams = PlayCommand.builder((Context) objM61090b, PlayOrigin.create("PreviewElementPlayerImpl")).loggingParams(m61092d(d850Var));
        m7r0Var.getClass();
        PreparePlayOptions.Builder builderSuppressions = PreparePlayOptions.builder().skipTo(SkipToTrack.fromUri(str3)).suppressions(Collections.singleton(Suppressions.Providers.MFT));
        PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        builderLoggingParams.options(builderSuppressions.playerOptionsOverride(builder.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).build());
        return builderLoggingParams.build();
    }
}
