package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.j70;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ActionTypeMap extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int ACTION_TYPE_FIELD_NUMBER = 1;
    private static final ActionTypeMap DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int actionType_;
    private Action action_;
    private int bitField0_;

    static {
        ActionTypeMap actionTypeMap = new ActionTypeMap();
        DEFAULT_INSTANCE = actionTypeMap;
        AbstractC0269h.registerDefaultInstance(ActionTypeMap.class, actionTypeMap);
    }

    private ActionTypeMap() {
    }

    /* JADX INFO: renamed from: p */
    public static ActionTypeMap m16394p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "actionType_", "action_"});
        }
        if (iOrdinal == 3) {
            return new ActionTypeMap();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 17);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (ActionTypeMap.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: n */
    public final Action m16395n() {
        Action action = this.action_;
        return action == null ? Action.m16391o() : action;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final j70 m16396o() {
        j70 j70Var;
        switch (this.actionType_) {
            case 0:
                j70Var = j70.CANCEL_FLOW;
                break;
            case 1:
                j70Var = j70.AVAILABLE_PLANS;
                break;
            case 2:
                j70Var = j70.INVITE_USER;
                break;
            case 3:
                j70Var = j70.EDIT_ADDRESS;
                break;
            case 4:
                j70Var = j70.PREPAID_TOPUP;
                break;
            case 5:
                j70Var = j70.RENEW_SUBSCRIPTION;
                break;
            case 6:
                j70Var = j70.CHANGE_PIN;
                break;
            case 7:
                j70Var = j70.INVITE_HELP;
                break;
            case 8:
                j70Var = j70.AUDIOBOOK_ENTRY;
                break;
            case 9:
                j70Var = j70.INVITE_OR_REMOVE_SUBACCOUNT;
                break;
            case 10:
                j70Var = j70.ADD_SUBACCOUNT;
                break;
            case 11:
                j70Var = j70.REMOVE_SUBACCOUNT;
                break;
            case 12:
                j70Var = j70.INVITE_SUBACCOUNT;
                break;
            case 13:
                j70Var = j70.ASTRO_GET_DETAILS;
                break;
            case 14:
                j70Var = j70.ASTRO_ENROLL;
                break;
            case 15:
                j70Var = j70.ASTRO_MANAGE;
                break;
            case 16:
                j70Var = j70.ASTRO_REQUEST;
                break;
            case 17:
                j70Var = j70.REMOVE_EXPIRING_ACCOUNT;
                break;
            case 18:
                j70Var = j70.MULTI_USER_PLAN_VERIFICATION;
                break;
            case 19:
                j70Var = j70.PARENTAL_CONTROLS;
                break;
            default:
                j70Var = null;
                break;
        }
        return j70Var == null ? j70.UNRECOGNIZED : j70Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
