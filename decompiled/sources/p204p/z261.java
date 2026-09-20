package p204p;

import com.spotify.personalizedepisodes.contentservice.p124v1.Prompt;
import com.spotify.personalizedepisodes.contentservice.p124v1.PromptCategory;
import com.spotify.personalizedepisodes.contentservice.p124v1.SuggestPromptsResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.TopSuggestion;
import java.util.ArrayList;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
public final class z261 {

    /* JADX INFO: renamed from: a */
    public final b361 f278505a;

    public z261(b361 b361Var) {
        this.f278505a = b361Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m95177a(ibk ibkVar) {
        x261 x261Var;
        if (ibkVar instanceof x261) {
            x261Var = (x261) ibkVar;
            int i = x261Var.f257369c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x261Var.f257369c = i - Integer.MIN_VALUE;
            } else {
                x261Var = new x261(this, ibkVar);
            }
        } else {
            x261Var = new x261(this, ibkVar);
        }
        Object objM27997a = x261Var.f257367a;
        int i2 = x261Var.f257369c;
        if (i2 == 0) {
            bga.m29073P(objM27997a);
            x261Var.f257369c = 1;
            objM27997a = this.f278505a.m27997a(x261Var);
            yuk yukVar = yuk.f276404a;
            if (objM27997a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM27997a);
        }
        o2x0 o2x0Var = (o2x0) objM27997a;
        if (!o2x0Var.f161171a.f149852O0) {
            throw new HttpException(o2x0Var);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful suggest prompts response");
        }
        ae50<PromptCategory> ae50VarM17523n = ((SuggestPromptsResponse) obj).m17523n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM17523n, 10));
        for (PromptCategory promptCategory : ae50VarM17523n) {
            String id = promptCategory.getId();
            String strM17467n = promptCategory.m17467n();
            ae50<Prompt> ae50VarM17468o = promptCategory.m17468o();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM17468o, 10));
            for (Prompt prompt : ae50VarM17468o) {
                arrayList2.add(new tds0(prompt.getId(), prompt.m17465n(), prompt.m17466o()));
            }
            arrayList.add(new aes0(id, strM17467n, arrayList2));
        }
        return new oy51(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m95178b(ibk ibkVar) {
        y261 y261Var;
        if (ibkVar instanceof y261) {
            y261Var = (y261) ibkVar;
            int i = y261Var.f268473c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y261Var.f268473c = i - Integer.MIN_VALUE;
            } else {
                y261Var = new y261(this, ibkVar);
            }
        } else {
            y261Var = new y261(this, ibkVar);
        }
        Object objM27997a = y261Var.f268471a;
        int i2 = y261Var.f268473c;
        if (i2 == 0) {
            bga.m29073P(objM27997a);
            y261Var.f268473c = 1;
            objM27997a = this.f278505a.m27997a(y261Var);
            yuk yukVar = yuk.f276404a;
            if (objM27997a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM27997a);
        }
        o2x0 o2x0Var = (o2x0) objM27997a;
        if (!o2x0Var.f161171a.f149852O0) {
            throw new HttpException(o2x0Var);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful suggest prompts response");
        }
        ae50<TopSuggestion> ae50VarM17524o = ((SuggestPromptsResponse) obj).m17524o();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM17524o, 10));
        for (TopSuggestion topSuggestion : ae50VarM17524o) {
            arrayList.add(new f781(topSuggestion.getId(), topSuggestion.getTitle(), topSuggestion.m17529n()));
        }
        return new g781(arrayList);
    }
}
