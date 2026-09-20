package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.IconName;
import com.spotify.pendragon.p123v1.proto.Signifier;
import com.spotify.pendragon.p123v1.proto.Text;
import com.spotify.pendragon.p123v1.proto.Trigger;
import com.spotify.yourupdates.domain.models.State;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class b321 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22795a;

    public /* synthetic */ b321(int i) {
        this.f22795a = i;
    }

    /* JADX INFO: renamed from: a */
    public wk51 m27987a(kk51 kk51Var) {
        jag1 qk51Var;
        lk51 lk51Var = kk51Var.f123514b;
        boolean zM56686b = kk51Var.m56686b();
        if (kk51Var.f123515c == 1) {
            qk51Var = new qk51(tc5.m80429q(lk51Var), lk51Var == lk51.f134260a ? gh9.f79857b : new hh9(tc5.m80428p(lk51Var)));
        } else {
            qk51Var = pk51.f178399e;
        }
        return new wk51(zM56686b, qk51Var);
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        IconName iconName;
        TriggerType triggerType;
        switch (this.f22795a) {
            case 0:
                Signifier signifier = (Signifier) obj;
                String strName = signifier.m17274p().m17219q().name();
                IconName iconName2 = IconName.ICON_UNKNOWN;
                IconName[] iconNameArrValues = IconName.values();
                int length = iconNameArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        iconName = iconNameArrValues[i];
                        if (!wj50.m88271j(iconName.name(), strName)) {
                            i++;
                        }
                    } else {
                        iconName = null;
                    }
                }
                if (iconName != null) {
                    iconName2 = iconName;
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Signifier(new Icon(iconName2, wl51.m88491o1(signifier.m17274p().m17218o()).toString()), signifier.m17275q(), wl51.m88491o1(signifier.m17276r()).toString());
            case 1:
                return dca1.valueOf(((State) obj).name());
            case 2:
                return m27987a((kk51) obj);
            case 3:
                Text text = (Text) obj;
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Text(text.m17301p(), text.m17302q());
            case 4:
                Trigger trigger = (Trigger) obj;
                String upperCase = trigger.m17313p().name().toUpperCase(Locale.ROOT);
                TriggerType triggerType2 = TriggerType.TRIGGER_TYPE_UNKNOWN;
                TriggerType[] triggerTypeArrValues = TriggerType.values();
                int length2 = triggerTypeArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        triggerType = triggerTypeArrValues[i2];
                        if (!wj50.m88271j(triggerType.name(), upperCase)) {
                            i2++;
                        }
                    } else {
                        triggerType = null;
                    }
                }
                if (triggerType != null) {
                    triggerType2 = triggerType;
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger(triggerType2, trigger.m17312o());
            case 5:
                y400 y400Var = (y400) obj;
                if (y400Var != null) {
                    return Boolean.valueOf(!y400Var.equals(qm41.f190124y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
            default:
                oqy.f168401b.get(((Number) obj).intValue());
                return null;
        }
    }

    public b321(tc5 tc5Var) {
        this.f22795a = 2;
    }
}
