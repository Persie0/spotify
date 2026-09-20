package androidx.car.app.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p204p.dq60;
import p204p.rzb;
import p204p.ty61;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private String mId;
    private boolean mIsRefresh;
    private ty61 mTemplate;
    private List<TemplateInfo> mTemplateInfoForScreenStack;

    private TemplateWrapper(ty61 ty61Var, String str) {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = ty61Var;
        this.mId = str;
    }

    public static TemplateWrapper copyOf(TemplateWrapper templateWrapper) {
        TemplateWrapper templateWrapperWrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        templateWrapperWrap.setRefresh(templateWrapper.isRefresh());
        templateWrapperWrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        List<TemplateInfo> templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            templateWrapperWrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return templateWrapperWrap;
    }

    private static String createRandomId() {
        return UUID.randomUUID().toString();
    }

    public static TemplateWrapper wrap(ty61 ty61Var) {
        return wrap(ty61Var, createRandomId());
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public String getId() {
        String str = this.mId;
        Objects.requireNonNull(str);
        return str;
    }

    public ty61 getTemplate() {
        ty61 ty61Var = this.mTemplate;
        Objects.requireNonNull(ty61Var);
        return ty61Var;
    }

    public List<TemplateInfo> getTemplateInfosForScreenStack() {
        List<TemplateInfo> list = this.mTemplateInfoForScreenStack;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i) {
        this.mCurrentTaskStep = i;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(ty61 ty61Var) {
        this.mTemplate = ty61Var;
    }

    public void setTemplateInfosForScreenStack(List<TemplateInfo> list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[template: ");
        sb.append(this.mTemplate);
        sb.append(", ID: ");
        return dq60.m36616p(this.mId, "]", sb);
    }

    public static TemplateWrapper wrap(ty61 ty61Var, String str) {
        Objects.requireNonNull(ty61Var);
        Objects.requireNonNull(str);
        return new TemplateWrapper(ty61Var, str);
    }

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }
}
