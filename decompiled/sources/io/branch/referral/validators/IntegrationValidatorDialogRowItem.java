package io.branch.referral.validators;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.spotify.music.R;
import p204p.e8u;

/* JADX INFO: loaded from: classes11.dex */
public class IntegrationValidatorDialogRowItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f7170a = 0;

    public IntegrationValidatorDialogRowItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.integration_validator_dialog_row_item, (ViewGroup) null);
        addView(viewInflate);
        ((Button) viewInflate.findViewById(R.id.details_button)).setOnClickListener(new e8u(3, this, context));
    }

    public IntegrationValidatorDialogRowItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
