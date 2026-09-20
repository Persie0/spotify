package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class mdv extends ConstraintLayout implements oqs {

    /* JADX INFO: renamed from: R0 */
    public final wg61 f142500R0;

    /* JADX INFO: renamed from: S0 */
    public final q6u f142501S0;

    /* JADX INFO: renamed from: T0 */
    public final wir f142502T0;

    public mdv(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.entity_body_view, this);
        this.f142500R0 = new wg61(new C2652zj(context, 20));
        q6u q6uVar = new q6u(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f142501S0 = q6uVar;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        this.f142502T0 = vqg1.m86248z(vqg1.m86216A(idv.f101248h, vqg1.m86247y(new cv8(1, this, mdv.class, "renderContentInformation", "renderContentInformation(Lcom/spotify/encoreconsumermobile/elements/entitybody/EntityBody$ContentInformationModel;)V", 0, 0, 1))), vqg1.m86216A(jdv.f111400h, vqg1.m86247y(new vas(i2, this, mdv.class, "renderDescription", "renderDescription(Ljava/lang/String;)V", i3, i, 21))), vqg1.m86216A(kdv.f121741h, vqg1.m86247y(new vas(i2, this, mdv.class, "renderMetadataModel", "renderMetadataModel(Lcom/spotify/encoreconsumermobile/elements/entitymetadata/EntityMetadata$Model;)V", i3, i, 22))), vqg1.m86216A(ldv.f132356h, vqg1.m86247y(new vas(i2, this, mdv.class, "renderLookDisabled", "renderLookDisabled(Ljava/lang/Boolean;)V", i3, i, 23))));
    }

    private final C2012je getAccessibilityBreakpointsHelper() {
        return (C2012je) this.f142500R0.getValue();
    }

    /* JADX INFO: renamed from: x */
    public static final void m61529x(mdv mdvVar, gdv gdvVar) {
        q6u q6uVar = mdvVar.f142501S0;
        if (gdvVar == null) {
            ((mdv) q6uVar.f185925b).findViewById(R.id.content_information_banner_slot).setVisibility(8);
        } else {
            psg1.m70832H(((mdv) q6uVar.f185925b).findViewById(R.id.content_information_banner_slot), gdvVar.f78952a);
            ((mdv) q6uVar.f185925b).findViewById(R.id.content_information_banner_slot).setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public static final void m61530z(mdv mdvVar, String str) {
        q6u q6uVar = mdvVar.f142501S0;
        if (str == null || wl51.m88460J0(str)) {
            ((EncoreTextView) ((wg61) q6uVar.f185926c).getValue()).setVisibility(8);
            return;
        }
        wg61 wg61Var = (wg61) q6uVar.f185926c;
        wg61 wg61Var2 = (wg61) q6uVar.f185926c;
        ((EncoreTextView) wg61Var.getValue()).setText(wl51.m88489m1(mdvVar.getContext().getResources().getInteger(R.integer.entity_body_length), str));
        ((EncoreTextView) wg61Var2.getValue()).setVisibility(0);
        int iM53046c = mdvVar.getAccessibilityBreakpointsHelper().m53046c(2);
        if (((EncoreTextView) wg61Var2.getValue()).getMaxLines() != iM53046c) {
            ((EncoreTextView) wg61Var2.getValue()).setMaxLines(iM53046c);
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        this.f142502T0.m88218a((hdv) obj);
    }
}
