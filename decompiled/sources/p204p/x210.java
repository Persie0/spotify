package p204p;

import com.google.protobuf.Timestamp;
import com.spotify.bluejay.data.api.GenerationServiceException;
import com.spotify.personalizedepisodes.contentservice.p124v1.ConfirmGenerationRequest;
import com.spotify.personalizedepisodes.contentservice.p124v1.ConfirmGenerationResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.CreateGenerationRequest;
import com.spotify.personalizedepisodes.contentservice.p124v1.CreateGenerationResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.CreateOrUpdatePendingShowRequest;
import com.spotify.personalizedepisodes.contentservice.p124v1.CreateOrUpdatePendingShowResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.EpisodeStatus;
import com.spotify.personalizedepisodes.contentservice.p124v1.GenerationProgress;
import com.spotify.personalizedepisodes.contentservice.p124v1.ListEpisodeStatusResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.ListShowStatusResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.Placeholder;
import com.spotify.personalizedepisodes.contentservice.p124v1.Preview;
import com.spotify.personalizedepisodes.contentservice.p124v1.RecommendedTool;
import com.spotify.personalizedepisodes.contentservice.p124v1.Show;
import com.spotify.personalizedepisodes.contentservice.p124v1.ShowItem;
import com.spotify.personalizedepisodes.contentservice.p124v1.ShowStatus;
import com.spotify.personalizedepisodes.contentservice.p124v1.StepAnswer;
import com.spotify.personalizedepisodes.contentservice.p124v1.ToolSelection;
import com.spotify.personalizedepisodes.contentservice.p124v1.ValidateStepAnswerRequest;
import com.spotify.personalizedepisodes.contentservice.p124v1.ValidateStepAnswerResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class x210 {

    /* JADX INFO: renamed from: a */
    public final i310 f257329a;

    public x210(i310 i310Var) {
        this.f257329a = i310Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    /* JADX INFO: renamed from: g */
    public static gaw m89696g(EpisodeStatus episodeStatus) {
        b310 b310VarM89697h = m89697h(episodeStatus.m17408p());
        Timestamp timestampM17409q = episodeStatus.m17409q();
        z050 z050VarM95041q6 = z050.m95041q6(timestampM17409q.m1969s(), timestampM17409q.m1968r());
        String strM17407o = episodeStatus.m17407o();
        if (episodeStatus.m17410r()) {
            wj50.m88279p(strM17407o);
            if (strM17407o.length() <= 0) {
                strM17407o = null;
            }
        } else {
            strM17407o = null;
        }
        return new gaw(b310VarM89697h, z050VarM95041q6, strM17407o);
    }

    /* JADX INFO: renamed from: h */
    public static b310 m89697h(GenerationProgress generationProgress) {
        e310 e310Var;
        String strM17412o = generationProgress.m17412o();
        switch (generationProgress.m17414q()) {
            case GENERATION_STATUS_UNSPECIFIED:
            case UNRECOGNIZED:
                e310Var = e310.f55590a;
                break;
            case GENERATION_STATUS_GENERATING:
                e310Var = e310.f55591b;
                break;
            case GENERATION_STATUS_GENERATED:
                e310Var = e310.f55592c;
                break;
            case GENERATION_STATUS_READY:
                e310Var = e310.f55593d;
                break;
            case GENERATION_STATUS_FAILED:
                e310Var = e310.f55594e;
                break;
            case GENERATION_STATUS_NO_CREDITS:
                e310Var = e310.f55595f;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Timestamp timestampM17413p = generationProgress.m17413p();
        return new b310(strM17412o, e310Var, z050.m95041q6(timestampM17413p.m1969s(), timestampM17413p.m1968r()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m89698a(xni xniVar, ibk ibkVar) {
        q210 q210Var;
        ShowItem showItem;
        nwo0 nwo0Var;
        String strM17371n;
        if (ibkVar instanceof q210) {
            q210Var = (q210) ibkVar;
            int i = q210Var.f184458c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q210Var.f184458c = i - Integer.MIN_VALUE;
            } else {
                q210Var = new q210(this, ibkVar);
            }
        } else {
            q210Var = new q210(this, ibkVar);
        }
        Object objM49533d = q210Var.f184456a;
        int i2 = q210Var.f184458c;
        if (i2 == 0) {
            bga.m29073P(objM49533d);
            wni wniVarM17370v = ConfirmGenerationRequest.m17370v();
            wniVarM17370v.m88598q(xniVar.f263620a);
            wniVarM17370v.m88601t(kxf1.m57602E(xniVar.f263621b));
            lo11 lo11Var = xniVar.f263622c;
            if (lo11Var instanceof ko11) {
                io11 io11VarM17507s = ShowItem.m17507s();
                tj11 tj11VarM17503q = Show.m17503q();
                tj11VarM17503q.m80963m(((ko11) lo11Var).f124500a);
                io11VarM17507s.m51143q((Show) tj11VarM17503q.build());
                showItem = (ShowItem) io11VarM17507s.build();
            } else {
                if (!(lo11Var instanceof jo11)) {
                    throw new NoWhenBranchMatchedException();
                }
                io11 io11VarM17507s2 = ShowItem.m17507s();
                y5o0 y5o0VarM17443u = Placeholder.m17443u();
                jo11 jo11Var = (jo11) lo11Var;
                y5o0VarM17443u.m92853r(jo11Var.f114269a);
                y5o0VarM17443u.m92854s(jo11Var.f114270b);
                y5o0VarM17443u.m92852q(jo11Var.f114271c);
                y5o0VarM17443u.m92851m(jo11Var.f114272d);
                io11VarM17507s2.m51142m((Placeholder) y5o0VarM17443u.build());
                showItem = (ShowItem) io11VarM17507s2.build();
            }
            wniVarM17370v.m88602u(showItem);
            String str = xniVar.f263623d;
            if (str != null) {
                wniVarM17370v.m88604w(str);
            }
            g081 g081Var = xniVar.f263624e;
            if (g081Var != null) {
                f081 f081VarM17527q = ToolSelection.m17527q();
                f081VarM17527q.m40444m(g081Var.f75311a);
                wniVarM17370v.m88603v((ToolSelection) f081VarM17527q.build());
            }
            ol21 ol21Var = xniVar.f263625f;
            if (ol21Var != null) {
                int iOrdinal = ol21Var.ordinal();
                if (iOrdinal == 0) {
                    nwo0Var = nwo0.PLAYBACK_CONTROL_DEFAULT;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nwo0Var = nwo0.PLAYBACK_CONTROL_CHAPTER_SKIP;
                }
                wniVarM17370v.m88600s(nwo0Var);
            }
            if (xniVar.f263626g) {
                wniVarM17370v.m88597m();
            }
            String str2 = xniVar.f263627h;
            if (str2 != null) {
                wniVarM17370v.m88599r(str2);
            }
            ConfirmGenerationRequest confirmGenerationRequest = (ConfirmGenerationRequest) wniVarM17370v.build();
            q210Var.f184458c = 1;
            objM49533d = this.f257329a.m49533d(confirmGenerationRequest, q210Var);
            yuk yukVar = yuk.f276404a;
            if (objM49533d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49533d);
        }
        o2x0 o2x0Var = (o2x0) objM49533d;
        if (!o2x0Var.f161171a.f149852O0) {
            throw iyg1.m51936w(o2x0Var);
        }
        ConfirmGenerationResponse confirmGenerationResponse = (ConfirmGenerationResponse) o2x0Var.f161172b;
        String str3 = null;
        if (confirmGenerationResponse != null && (strM17371n = confirmGenerationResponse.m17371n()) != null && strM17371n.length() > 0) {
            str3 = strM17371n;
        }
        return new yni(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Object m89699b(d6l d6lVar, ibk ibkVar) {
        r210 r210Var;
        Object ko11Var;
        if (ibkVar instanceof r210) {
            r210Var = (r210) ibkVar;
            int i = r210Var.f195011c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r210Var.f195011c = i - Integer.MIN_VALUE;
            } else {
                r210Var = new r210(this, ibkVar);
            }
        } else {
            r210Var = new r210(this, ibkVar);
        }
        Object objM49530a = r210Var.f195009a;
        int i2 = r210Var.f195011c;
        if (i2 == 0) {
            bga.m29073P(objM49530a);
            c6l c6lVarM17381s = CreateGenerationRequest.m17381s();
            c6lVarM17381s.m31581r(d6lVar.f45719a);
            c6lVarM17381s.m31583t(d6lVar.f45720b);
            c6lVarM17381s.m31579m(d6lVar.f45721c);
            List<s151> list = d6lVar.f45723e;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            for (s151 s151Var : list) {
                r151 r151VarM17521q = StepAnswer.m17521q();
                r151VarM17521q.m74459r(s151Var.f204603a);
                r151VarM17521q.m74457m(s151Var.f204604b);
                r151VarM17521q.m74458q(s151Var.f204605c);
                arrayList.add((StepAnswer) r151VarM17521q.build());
            }
            c6lVarM17381s.m31580q(arrayList);
            ney0 ney0Var = d6lVar.f45722d;
            if (ney0Var != null) {
                c6lVarM17381s.m31582s(kxf1.m57602E(ney0Var));
            }
            CreateGenerationRequest createGenerationRequest = (CreateGenerationRequest) c6lVarM17381s.build();
            r210Var.f195011c = 1;
            objM49530a = this.f257329a.m49530a(createGenerationRequest, r210Var);
            yuk yukVar = yuk.f276404a;
            if (objM49530a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49530a);
        }
        o2x0 o2x0Var = (o2x0) objM49530a;
        if (!o2x0Var.f161171a.f149852O0) {
            throw iyg1.m51936w(o2x0Var);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful create generation response");
        }
        CreateGenerationResponse createGenerationResponse = (CreateGenerationResponse) obj;
        String strM17383o = createGenerationResponse.m17383o();
        Preview previewM17384p = createGenerationResponse.m17384p();
        e4r0 e4r0Var = new e4r0(previewM17384p.getDescription(), previewM17384p.m17464n());
        ae50 ae50VarM17389u = createGenerationResponse.m17389u();
        ArrayList arrayList2 = new ArrayList();
        Iterator<E> it = ae50VarM17389u.iterator();
        while (true) {
            ko11Var = null;
            if (!it.hasNext()) {
                break;
            }
            ShowItem showItem = (ShowItem) it.next();
            wj50.m88279p(showItem);
            int iM17508p = showItem.m17508p();
            int i3 = iM17508p == 0 ? -1 : p210.f173208a[edb.m38547C(iM17508p)];
            if (i3 == 1) {
                ko11Var = new ko11(showItem.m17510r().m17504p());
            } else if (i3 == 2) {
                ko11Var = new jo11(showItem.m17509q().getId(), showItem.m17509q().m17445s(), showItem.m17509q().getTitle(), showItem.m17509q().m17444r());
            }
            if (ko11Var != null) {
                arrayList2.add(ko11Var);
            }
        }
        dsc1 dsc1Var = new dsc1(createGenerationResponse.m17390v().getId(), createGenerationResponse.m17390v().getName(), createGenerationResponse.m17390v().getDescription(), createGenerationResponse.m17390v().m17549o());
        ney0 ney0Var2 = (!createGenerationResponse.m17391w() || createGenerationResponse.m17386r().m17490r() == ufy0.SCHEDULE_TYPE_UNSPECIFIED || createGenerationResponse.m17386r().m17490r() == ufy0.SCHEDULE_TYPE_NONE) ? new ney0(1, null) : kxf1.m57601D(createGenerationResponse.m17386r());
        boolean zM17388t = createGenerationResponse.m17388t();
        ae50<RecommendedTool> ae50VarM17387s = createGenerationResponse.m17387s();
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(ae50VarM17387s, 10));
        for (RecommendedTool recommendedTool : ae50VarM17387s) {
            wj50.m88279p(recommendedTool);
            arrayList3.add(new ogv0(recommendedTool.getId(), recommendedTool.m17482q(), recommendedTool.getName(), recommendedTool.m17481p(), recommendedTool.m17479n(), recommendedTool.m17480o()));
        }
        String strM17382n = createGenerationResponse.m17382n();
        int iOrdinal = createGenerationResponse.m17385q().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ko11Var = ol21.f166736c;
            } else if (iOrdinal == 2) {
                ko11Var = ol21.f166735b;
            } else if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new e6l(strM17383o, e4r0Var, arrayList2, dsc1Var, ney0Var2, zM17388t, arrayList3, strM17382n, ko11Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m89700c(kal kalVar, ibk ibkVar) {
        s210 s210Var;
        if (ibkVar instanceof s210) {
            s210Var = (s210) ibkVar;
            int i = s210Var.f204874c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s210Var.f204874c = i - Integer.MIN_VALUE;
            } else {
                s210Var = new s210(this, ibkVar);
            }
        } else {
            s210Var = new s210(this, ibkVar);
        }
        Object objM49532c = s210Var.f204872a;
        int i2 = s210Var.f204874c;
        if (i2 == 0) {
            bga.m29073P(objM49532c);
            cal calVarM17394p = CreateOrUpdatePendingShowRequest.m17394p();
            calVarM17394p.m32061m(kalVar.f120930a);
            calVarM17394p.m32062q(kalVar.f120931b);
            CreateOrUpdatePendingShowRequest createOrUpdatePendingShowRequest = (CreateOrUpdatePendingShowRequest) calVarM17394p.build();
            s210Var.f204874c = 1;
            objM49532c = this.f257329a.m49532c(createOrUpdatePendingShowRequest, s210Var);
            yuk yukVar = yuk.f276404a;
            if (objM49532c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49532c);
        }
        o2x0 o2x0Var = (o2x0) objM49532c;
        if (!o2x0Var.f161171a.f149852O0) {
            throw iyg1.m51936w(o2x0Var);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful createOrUpdatePendingShow response");
        }
        CreateOrUpdatePendingShowResponse createOrUpdatePendingShowResponse = (CreateOrUpdatePendingShowResponse) obj;
        return new lal(createOrUpdatePendingShowResponse.m17395n().getId(), createOrUpdatePendingShowResponse.m17395n().getTitle(), createOrUpdatePendingShowResponse.m17395n().m17444r(), createOrUpdatePendingShowResponse.m17395n().m17445s());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Serializable m89701d(String str, ibk ibkVar) {
        t210 t210Var;
        if (ibkVar instanceof t210) {
            t210Var = (t210) ibkVar;
            int i = t210Var.f216404c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t210Var.f216404c = i - Integer.MIN_VALUE;
            } else {
                t210Var = new t210(this, ibkVar);
            }
        } else {
            t210Var = new t210(this, ibkVar);
        }
        Object objM49536g = t210Var.f216402a;
        int i2 = t210Var.f216404c;
        if (i2 == 0) {
            bga.m29073P(objM49536g);
            t210Var.f216404c = 1;
            objM49536g = this.f257329a.m49536g(str, null, t210Var);
            yuk yukVar = yuk.f276404a;
            if (objM49536g == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49536g);
        }
        o2x0 o2x0Var = (o2x0) objM49536g;
        if (!o2x0Var.f161171a.f149852O0) {
            throw iyg1.m51936w(o2x0Var);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful get episode statuses response");
        }
        ae50<EpisodeStatus> ae50VarM17426n = ((ListEpisodeStatusResponse) obj).m17426n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM17426n, 10));
        for (EpisodeStatus episodeStatus : ae50VarM17426n) {
            wj50.m88279p(episodeStatus);
            arrayList.add(m89696g(episodeStatus));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Serializable m89702e(List list, z050 z050Var, ibk ibkVar) throws GenerationServiceException {
        u210 u210Var;
        c310 c310Var;
        String str;
        if (ibkVar instanceof u210) {
            u210Var = (u210) ibkVar;
            int i = u210Var.f225956c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u210Var.f225956c = i - Integer.MIN_VALUE;
            } else {
                u210Var = new u210(this, ibkVar);
            }
        } else {
            u210Var = new u210(this, ibkVar);
        }
        Object objM49535f = u210Var.f225954a;
        int i2 = u210Var.f225956c;
        if (i2 == 0) {
            bga.m29073P(objM49535f);
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iOrdinal = ((e310) it.next()).ordinal();
                if (iOrdinal == 0) {
                    c310Var = c310.GENERATION_STATUS_UNSPECIFIED;
                } else if (iOrdinal == 1) {
                    c310Var = c310.GENERATION_STATUS_GENERATING;
                } else if (iOrdinal == 2) {
                    c310Var = c310.GENERATION_STATUS_GENERATED;
                } else if (iOrdinal == 3) {
                    c310Var = c310.GENERATION_STATUS_READY;
                } else if (iOrdinal == 4) {
                    c310Var = c310.GENERATION_STATUS_FAILED;
                } else {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c310Var = c310.GENERATION_STATUS_NO_CREDITS;
                }
                arrayList.add(c310Var.name());
            }
            String strM30060a = z050Var != null ? bno.f28902k.m30060a(z050Var) : null;
            u210Var.f225956c = 1;
            objM49535f = this.f257329a.m49535f(arrayList, strM30060a, u210Var);
            yuk yukVar = yuk.f276404a;
            if (objM49535f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49535f);
        }
        o2x0 o2x0Var = (o2x0) objM49535f;
        if (!o2x0Var.f161171a.f149852O0) {
            throw iyg1.m51936w(o2x0Var);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful get show statuses response");
        }
        ae50<ShowStatus> ae50VarM17428n = ((ListShowStatusResponse) obj).m17428n();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM17428n, 10));
        for (ShowStatus showStatus : ae50VarM17428n) {
            wj50.m88279p(showStatus);
            String title = showStatus.getTitle();
            String strM17511n = showStatus.m17511n();
            wj50.m88279p(strM17511n);
            String str2 = strM17511n.length() > 0 ? strM17511n : null;
            String strM17515r = showStatus.m17515r();
            if (showStatus.m17517t()) {
                wj50.m88279p(strM17515r);
                if (strM17515r.length() > 0) {
                    str = strM17515r;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            b310 b310VarM89697h = m89697h(showStatus.m17513p());
            Timestamp timestampM17514q = showStatus.m17514q();
            z050 z050VarM95041q6 = z050.m95041q6(timestampM17514q.m1969s(), timestampM17514q.m1968r());
            EpisodeStatus episodeStatusM17512o = showStatus.m17512o();
            if (!showStatus.m17516s()) {
                episodeStatusM17512o = null;
            }
            arrayList2.add(new ur11(title, str2, str, b310VarM89697h, z050VarM95041q6, episodeStatusM17512o != null ? m89696g(episodeStatusM17512o) : null));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m89703f(String str, fbk fbkVar) {
        v210 v210Var;
        if (fbkVar instanceof v210) {
            v210Var = (v210) fbkVar;
            int i = v210Var.f236519c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v210Var.f236519c = i - Integer.MIN_VALUE;
            } else {
                v210Var = new v210(this, fbkVar);
            }
        } else {
            v210Var = new v210(this, fbkVar);
        }
        Object objM49534e = v210Var.f236517a;
        int i2 = v210Var.f236519c;
        if (i2 == 0) {
            bga.m29073P(objM49534e);
            v210Var.f236519c = 1;
            objM49534e = this.f257329a.m49534e(str, v210Var);
            yuk yukVar = yuk.f276404a;
            if (objM49534e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49534e);
        }
        o2x0 o2x0Var = (o2x0) objM49534e;
        if (o2x0Var.f161171a.f149852O0) {
            return w2a1.f247311a;
        }
        throw iyg1.m51936w(o2x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m89704i(n2b1 n2b1Var, ibk ibkVar) throws GenerationServiceException {
        w210 w210Var;
        if (ibkVar instanceof w210) {
            w210Var = (w210) ibkVar;
            int i = w210Var.f247207c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w210Var.f247207c = i - Integer.MIN_VALUE;
            } else {
                w210Var = new w210(this, ibkVar);
            }
        } else {
            w210Var = new w210(this, ibkVar);
        }
        Object objM49531b = w210Var.f247205a;
        int i2 = w210Var.f247207c;
        if (i2 == 0) {
            bga.m29073P(objM49531b);
            m2b1 m2b1VarM17544p = ValidateStepAnswerRequest.m17544p();
            m2b1VarM17544p.m60573q(n2b1Var.f149732a);
            m2b1VarM17544p.m60572m(n2b1Var.f149733b);
            ValidateStepAnswerRequest validateStepAnswerRequest = (ValidateStepAnswerRequest) m2b1VarM17544p.build();
            w210Var.f247207c = 1;
            objM49531b = this.f257329a.m49531b(validateStepAnswerRequest, w210Var);
            yuk yukVar = yuk.f276404a;
            if (objM49531b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49531b);
        }
        o2x0 o2x0Var = (o2x0) objM49531b;
        if (!o2x0Var.f161171a.f149852O0) {
            throw iyg1.m51936w(o2x0Var);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful validate step answer response");
        }
        ValidateStepAnswerResponse validateStepAnswerResponse = (ValidateStepAnswerResponse) obj;
        boolean zM17545n = validateStepAnswerResponse.m17545n();
        String strM17546o = validateStepAnswerResponse.m17546o();
        if (!validateStepAnswerResponse.m17547p()) {
            strM17546o = null;
        }
        return new o2b1(zM17545n, strM17546o);
    }
}
